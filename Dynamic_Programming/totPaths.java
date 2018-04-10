import java.util.Arrays;

class totPaths {
  public static int totPath(int x, int y) {
    int[][] dp = new int[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        if (i == 0 || j == 0)
          dp[i][j] = 1;
        else
          dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[x - 1][y - 1];
  }

  public static void main(String[] args) {
    System.out.println(totPath(3, 3));
  }
}