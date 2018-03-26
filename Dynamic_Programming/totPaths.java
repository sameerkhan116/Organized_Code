import java.util.Arrays;

class totPaths {
  public static int tot(int m, int n) {
    int[][] table = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0 || j == 0)
          table[i][j] = 1;
        else
          table[i][j] = table[i - 1][j] + table[i][j - 1];
      }
    }
    System.out.println(Arrays.deepToString(table));
    return table[m - 1][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(tot(3, 3));
  }
}