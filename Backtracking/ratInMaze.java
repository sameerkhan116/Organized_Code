import java.util.Arrays;
/*
  Time Complexity: O(n*n)
*/
class ratInMaze {
  static int N = 4;

  public static int[][] solveMaze(int[][] maze) {
    int[][] sol = new int[N][N];

    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        sol[i][j] = 0;
      }
    }

    if(solveUtil(sol, maze, 0, 0)) return sol;
    return null;
  }

  public static boolean solveUtil(int[][] sol, int[][] maze, int x, int y) {
    if(x == N - 1 && y == N - 1) {
      sol[x][y] = 1;
      return true;
    }

    if(isSafe(x, y, maze)) {
      sol[x][y] = 1;
      if(solveUtil(sol, maze, x + 1, y)) return true;
      if(solveUtil(sol, maze, x, y + 1)) return true;
      sol[x][y] = 0;
    }
    return false;
  }

  // helper function to check if the current move is safe or not
  private static boolean isSafe(int x, int y, int[][] maze) {
    return (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1);
  }

  public static void main(String[] args) {
    int maze[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
    System.out.println(Arrays.deepToString(solveMaze(maze)));
  }
}