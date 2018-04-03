import java.util.Arrays;

class encode {
  public static String enc(String s) {
    if (s == null || s.length() == 0)
      return "";

    int m = s.length();
    String[][] dp = new String[m][m];
    for (int len = 0; len < m; len++) {
      for (int i = 0; i + len < m; i++) {
        int j = i + len;
        String substr = s.substring(i, j + 1);
        dp[i][j] = substr;
        if (len < 4)
          continue;
        for (int k = i; k < j; k++) {
          if (dp[i][k].length() + dp[k + 1][j].length() < dp[i][j].length())
            dp[i][j] = dp[i][k] + dp[k + 1][j];
        }
        for (int k = i; k < j; k++) {
          String repeat = s.substring(i, k + 1);
          if (substr.length() % (k - i + 1) == 0 && substr.replaceAll(repeat, "").length() == 0) {
            String ss = substr.length() / repeat.length() + "[" + dp[i][k] + "]";
            if (ss.length() <= dp[i][j].length())
              dp[i][j] = ss;
          }
        }
      }
    }
    System.out.println(Arrays.deepToString(dp));
    return dp[0][m - 1];
  }

  public static void main(String[] args) {
    System.out.println(enc("aaaaabb"));
  }
}