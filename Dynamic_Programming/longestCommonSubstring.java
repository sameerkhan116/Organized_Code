/* 
  Time complexity: O(n*n)
*/

class longestCommonSubs {
  public static int LCS(String a, String b) {
    char[] X = a.toCharArray(), Y = b.toCharArray();
    int m = a.length(), n = b.length(), result = 0;
    int[][] table = new int[m + 1][n + 1];

    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0)
          table[i][j] = 0;
        else if (X[i - 1] == Y[j - 1]) {
          table[i][j] = 1 + table[i - 1][j - 1];
          result = Math.max(table[i][j], result);
        } else
          table[i][j] = 0;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(LCS("GeeksforGeeks", "GeeksQuiz"));
  }
}