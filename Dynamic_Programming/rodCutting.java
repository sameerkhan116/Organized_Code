import java.util.Arrays;

/* 
  Time complexity: O(n*n)
*/
class rodCutting {
  public static int cut(int len, int[] val) {
    int[] dp = new int[len + 1];
    dp[0] = 0;
    for (int i = 1; i <= len; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 1; j <= i; j++) {
        max = Math.max(max, val[j - 1] + dp[i - j]);
        dp[i] = max;
      }
    }
    System.out.println(Arrays.toString(dp));
    return dp[len];
  }

  public static void main(String[] args) {
    System.out.println(cut(8, new int[] { 1, 5, 8, 9, 10, 17, 17, 20 }));
  }
}