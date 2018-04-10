/* 
  Time complexity: O(n*n)
*/

class longestPalindromicSubseq {
  public static int palindrome(String a) {
    int n = a.length();
    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++)
      dp[i][i] = 1;
    for (int l = 2; l <= n; l++) {
      for (int i = 0; i <= n - l; i++) {
        int j = i + l - 1;
        if (l == 2 && a.charAt(i) == a.charAt(j))
          dp[i][j] = 2;
        else if (a.charAt(i) == a.charAt(j))
          dp[i][j] = 2 + dp[i + 1][j - 1];
        else
          dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
      }
    }
    return dp[0][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(palindrome("agbdba"));
  }
}