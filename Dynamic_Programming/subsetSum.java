import java.util.Arrays;

class subsetSum {
  public static boolean subsets(int[] arr, int sum) {
    boolean[][] dp = new boolean[arr.length][sum + 1];
    for (int i = 0; i < arr.length; i++)
      dp[i][0] = true;
    for (int j = 1; j <= sum; j++) {
      dp[0][j] = (j == arr[0]) ? true : false;
    }
    for (int i = 1; i < arr.length; i++) {
      for (int j = 1; j <= sum; j++) {
        if (arr[i] > j)
          dp[i][j] = dp[i - 1][j];
        else
          dp[i][j] = dp[i - 1][j - arr[i]] || dp[i - 1][j];
      }
    }
    return dp[arr.length - 1][sum];
  }

  public static void main(String[] args) {
    System.out.println(subsets(new int[] { 2, 3, 7, 8, 10 }, 11));
  }
}