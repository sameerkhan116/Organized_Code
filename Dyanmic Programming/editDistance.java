import java.util.Arrays;

class editDistance {
  public static int edit(String s, String t) {
    int m = s.length(), n = t.length();
    int table[][] = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++)
      table[i][0] = i;
    for (int i = 0; i <= n; i++) {
      table[0][i] = i;
    }

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        int cost = s.charAt(i - 1) == t.charAt(j - 1) ? 0 : 1;
        table[i][j] = Math.min(Math.min(table[i - 1][j] + 1, table[i][j - 1] + 1), table[i - 1][j - 1] + cost);
      }
    }
    System.out.println(Arrays.deepToString(table));
    return table[m][n];
  }

  public static void main(String[] args) {
    System.out.println(edit("sea", "eat"));
  }
}