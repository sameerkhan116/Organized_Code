import java.util.Arrays;

/* 
  Time complexity: O(mn)
*/
class minCostPath {
  public static int minCost(int[][] arr) {
    int[][] dp = new int[arr.length][arr[0].length];
    dp[0][0] = arr[0][0];
    for (int i = 1; i < arr.length; i++)
      dp[i][0] = dp[i - 1][0] + arr[i][0];
    for (int j = 1; j < arr[0].length; j++)
      dp[0][j] = arr[0][j] + dp[0][j - 1];
    for (int i = 1; i < arr.length; i++) {
      for (int j = 1; j < arr[0].length; j++) {
        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + arr[i][j];
      }
    }
    return dp[arr.length - 1][arr[0].length - 1];
  }

  public static void main(String[] args) {
    System.out.println(minCost(new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } }));
  }
}