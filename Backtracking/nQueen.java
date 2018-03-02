import java.util.Arrays;

/*
Time Complexity: O(n!)
*/

class nQueen {
    static int N = 4;

    public static int[][] solvenQ() {
      // initialize new board for given size
      int[][] board = new int[N][N];
      // fill up board with 0 for now
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
          board[i][j] = 0;
        }
      }
      // run recursive function solve on it and if it return true, return board
      if(solveUtil(board, 0)) return board;
      return null;
    }

    public static boolean solveUtil(int[][] board, int q) {
      // if number of queen is equal to dimension of board, return true
      if(q == N) return true;
      // otherwise loop for size of board
      for(int i = 0; i < N; i++) {
        // if the next queen can be safely placed, recursively call this function incrementing number of queens
        if(isSafe(i, q, board)) {
          board[i][q] = 1;
          if(solveUtil(board, q + 1)) return true;
          // otherwise backtrack and set current possibility to 0
          board[i][q] = 0;
        }
      }
      return false;
    }

    // A helper function to check if the queen can be safely placed on the board
    // This function is called when y queens are already placed in columns from 0 to n-1
    // so we need to check only left side for attacking queenss
    private static boolean isSafe(int x, int y, int[][] board) {
      // Check the row on left side
      for(int i = 0; i < y; i++) {
        if(board[x][i] == 1) return false;
      }
      // check upper diagonal on left side
      for(int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
        if(board[i][j] == 1) return false;
      }
      // check lower diagonal on left side
      for(int i = x, j = y; i < N && j >= 0; i++, j--) {
        if(board[i][j] == 1) return false;
      }
      return true;
    }

    public static void main(String[] args) {
      System.out.println(Arrays.deepToString(solvenQ()));
    }
}