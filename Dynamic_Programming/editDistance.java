import java.util.Arrays;
/* 
  Time complexity: O(mn)
*/
class editDistance {
  public static int edit(String s, String t) {
    int m = s.length(), n = t.length();
    char[] X = s.toCharArray(), Y = t.toCharArray();
    int table[][] = new int[m + 1][n + 1];
    
    for(int i = 0; i <= m; i++) {
      for(int j = 0; j <= n; j++) {
        if(i == 0) table[i][j] = j;
        else if(j == 0) table[i][j] = i;
        else if(X[i - 1] == Y[j - 1]) table[i][j] = table[i-1][j-1];
        else table[i][j] = 1 + Math.min(table[i-1][j-1], Math.min(table[i][j-1], table[i-1][j]));
      }
    }

    System.out.println(Arrays.deepToString(table));
    return table[m][n];
  }

  public static void main(String[] args) {
    System.out.println(ed("sea", "eat"));
    System.out.println(ed("sunday", "saturday"));
  }
}