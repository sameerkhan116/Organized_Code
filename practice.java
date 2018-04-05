import java.util.*;

class practice {
  public static int LPS(String a) {
    int n = a.length();
    char[] str = a.toCharArray();
    int[][] table = new int[n][n];

    for(int i = 0; i < n; i++) {
      table[i][i] = 1;
    }

    for(int l = 2; l <= n; l++){
      for(int i = 0; i <= n - l; i++) {
        int j = i + l - 1;
        if(l == 2 && str[i] == str[j]) table[i][j] = 2;
        else if(str[i] == str[j]) table[i][j] = 2 + table[i + 1][j - 1];
        else table[i][j] = Math.max(table[i + 1][j], table[i][j - 1]);
      }
    }

    System.out.println(Arrays.deepToString(table));
    return table[0][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(LPS("agbdba"));
  }
}