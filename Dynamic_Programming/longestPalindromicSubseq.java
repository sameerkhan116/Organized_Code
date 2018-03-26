/* 
  Time complexity: O(n*n)
*/

class longestPalindromicSubseq {
  public static int LPS(String a) {
    int x = a.length();
    char[] X = a.toCharArray();
    int[][] table = new int[x][x];

    for (int i = x - 1; i >= 0; i--) {
      table[i][i] = 1;
      for (int j = i + 1; j < x; j++) {
        if (X[i] == X[j]) {
          table[i][j] = table[i + 1][j - 1] + 2;
        } else {
          table[i][j] = Math.max(table[i + 1][j], table[i][j - 1]);
        }
      }
    }
    return table[0][x - 1];
  }

  public static void main(String[] args) {
    System.out.println(LPS("bbbab"));
  }
}