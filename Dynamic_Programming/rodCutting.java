import java.util.Arrays;

/* 
  Time complexity: O(n*n)
*/
class rodCutting {
  public static int cut(int[] val) {
    int len = val.length;
    int[] dp = new int[len + 1];
    dp[0] = 0;
    for (int i = 1; i <= len; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i] = Math.max(dp[i], val[j - 1] + dp[i - j]);
      }
    }
    System.out.println(Arrays.toString(dp));
    return dp[len];
  }

  public static void main(String[] args) {
    System.out.println(cut(new int[] { 1, 5, 8, 9, 10, 17, 17, 20 }));
  }
}