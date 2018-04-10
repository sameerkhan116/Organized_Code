import java.util.Arrays;

/* 
  Time complexity: O(n*n)
*/
class longestIncSubseq {
  public static int maximum(int[] nums) {
    int max = 0;
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);
    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j] && dp[i] < dp[j] + 1)
          dp[i] = dp[j] + 1;
        max = Math.max(max, dp[i]);
      }
    }
    return max;
  }

  public static void main(String[] argss) {
    System.out.println(maximum(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 }));
  }
}