import java.util.Arrays;

/* 
  Time complexity: O(n^2)
*/

class maxSumIncSubseq {
  public static int maxSum(int[] arr) {
    int[] dp = new int[arr.length];
    dp[0] = arr[0];
    int max = 0;
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (dp[i] < arr[i] + dp[j] && arr[i] == arr[j] + 1)
          dp[i] = dp[j] + arr[i];
        max = Math.max(dp[i], max);
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(maxSum(new int[] { 1, 101, 2, 3, 100, 4, 5 }));
  }
}