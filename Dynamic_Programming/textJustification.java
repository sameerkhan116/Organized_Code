import java.util.Arrays;

class textJustification {
  public static String justify(String[] strs, int width) {
    int n = strs.length;
    int[][] dp = new int[n][n];

    for (int i = 0; i < n; i++) {
      dp[i][i] = width - strs[i].length();
      for (int j = i + 1; j < n; j++) {
        dp[i][j] = dp[i][j - 1] - 1 - strs[j].length();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (dp[i][j] < 0)
          dp[i][j] = Integer.MAX_VALUE;
        else
          dp[i][j] = (int) Math.pow(dp[i][j], 2);
      }
    }

    int minCost[] = new int[n];
    int result[] = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      minCost[i] = dp[i][n - 1];
      result[i] = n;
      for (int j = n - 1; j > i; j--) {
        if (dp[i][j - 1] == Integer.MAX_VALUE)
          continue;
        if (minCost[i] > minCost[j] + dp[i][j - 1]) {
          minCost[i] = minCost[j] + dp[i][j - 1];
          result[i] = j;
        }
      }
    }
    System.out.println(Arrays.toString(result));

    int i = 0, j;
    StringBuilder str = new StringBuilder();
    do {
      j = result[i];
      for (int k = i; k < j; k++) {
        str.append(strs[k] + " ");
      }
      str.append("\n");
      i = j;
    } while (j < n);
    return str.toString();
  }

  public static void main(String[] args) {
    System.out.println(justify(new String[] { "Sameer", "Khan", "likes", "to", "code" }, 10));
  }
}