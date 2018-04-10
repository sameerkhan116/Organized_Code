import java.util.Arrays;

class WildCard {
  public static boolean match(String a, String b) {
    int m = a.length(), n = b.length();
    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;
    int startIndex = 1;

    for (int i = 1; i < m; i++) {
      dp[i][0] = false;
    }
    if (b.charAt(0) == '*') {
      for (int i = 0; i < m; i++) {
        dp[i][1] = true;
      }
      startIndex++;
    }

    for (int i = 1; i <= m; i++) {
      for (int j = startIndex; j <= n; j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1) || b.charAt(j - 1) == '?')
          dp[i][j] = dp[i - 1][j - 1];
        else if (b.charAt(j - 1) == '*')
          dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
      }
    }
    return dp[m][n];
  }

  public static void main(String[] args) {
    System.out.println(match("xaylmz", "x?y*z"));
  }
}