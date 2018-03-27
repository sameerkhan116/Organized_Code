import java.util.Arrays;

/*
Time Complexity: O(k^N) where N is the number of squares on the board and k is the dimension of board

Explanation:
------------
1. Create for N X N given dimensions;
2. Create two sets of possible moves along X and Y.
3. Pass a, b, start, board, xmove, ymove to backtracking funtion

IN backtrackign function
if(curMove = N*N) return true;
Loop from k = 0 to N;
  a = a + xmove[k], b = b + yMove[k]
  if(isSafe(a, b, sol)): sol[a][b] = curMove, increment pos in backtrackign function, set sol[a][b] = - 1
  return false
*/

class knightsTour {
  static int N = 8; // dimension of chessboard

  // Function to solve the Knight's tour problem
  public static int[][] solveKT() {
    int sol[][] = new int[N][N];

    // initialize the sol array with values -1 everywhere
    for (int x = 0; x < N; x++) {
      for (int y = 0; y < N; y++) {
        sol[x][y] = -1;
      }
    }

    // listing all possible moves for the Knight in x and y axis
    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    // set initial knight position to 0
    sol[0][0] = 0;

    // if solution is reached, return the sol array
    if (solveUtil(0, 0, 1, sol, xMove, yMove))
      return sol;
    //otherwise return null
    return null;
  }

  // Helper function to check if we reach a solution using recursion
  private static boolean solveUtil(int x, int y, int curMove, int sol[][], int xMove[], int yMove[]) {
    // if 64 moves are made (all possible places on the chessboard are covered), return true
    if (curMove == N * N)
      return true;

    // get next_x, next_y from the xMove and yMove array and check if they are safe
    for (int k = 0; k < N; k++) {
      int a = x + xMove[k], b = y + yMove[k];
      if (isSafe(a, b, sol)) {
        // if the move is safe, set the move to the move number (movei)
        sol[a][b] = curMove;
        // recurively call function to check if all moves are made and return true if they are
        if (solveUtil(a, b, curMove + 1, sol, xMove, yMove))
          return true;
        // otherwise set current to -1 and continue
        else
          sol[a][b] = -1;
      }
    }
    return false;
  }

  // Function to check if i and j are valid indexes on a chessboard
  private static boolean isSafe(int x, int y, int sol[][]) {
    return (x >= 0 && y >= 0 && x < N && y < N && sol[x][y] == -1);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(solveKT()));
  }
}