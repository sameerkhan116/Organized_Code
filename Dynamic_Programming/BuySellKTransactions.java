class BuySellKTransactions {
  public static int max(int[] arr, int k) {
    if (k == 0 || arr.length == 0)
      return 0;
    int dp[][] = new int[k + 1][arr.length];

    for (int i = 1; i < dp.length; i++) {
      int maxDiff = -arr[0];
      for (int j = 1; j < dp[0].length; j++) {
        dp[i][j] = Math.max(dp[i][j - 1], arr[j] + maxDiff);
        maxDiff = Math.max(maxDiff, dp[i - 1][j] - arr[j]);
      }
    }
    return dp[k][arr.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(max(new int[] { 2, 5, 7, 1, 4, 3, 1, 3 }, 3));
  }
}