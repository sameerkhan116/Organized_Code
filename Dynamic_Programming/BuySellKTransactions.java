
/* 
  Time complexity: O(k * no. of days)
*/

import java.util.Arrays;

class BuySellKTransactions {
  public static int sell(int[] arr, int k) {
    int n = arr.length;
    int[][] dp = new int[k + 1][n];
    for (int i = 1; i <= k; i++) {
      int maxDiff = -arr[0];
      for (int j = 1; j < n; j++) {
        dp[i][j] = Math.max(maxDiff + arr[j], dp[i][j - 1]);
        maxDiff = Math.max(dp[i - 1][j] - arr[j], maxDiff);
      }
    }
    return dp[k][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(sell(new int[] { 2, 5, 7, 1, 4, 3, 1, 3 }, 3));
  }
}