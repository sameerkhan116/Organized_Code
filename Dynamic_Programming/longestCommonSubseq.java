/* 
  Time Complexity: O(mn)
  Space Complexity: O(n^2)
*/
class longestCommonSubseq {
  public static int longest(String a, String b) {
    int m = a.length(), n = b.length();
    char[] X = a.toCharArray(), Y = b.toCharArray();
    int[][] arr = new int[m + 1][n + 1];

    for(int i = 0; i <= m; i++){
      for(int j = 0; j <= n; j++) {
        if(i == 0 || j == 0) arr[i][j] = 0;
        else if(X[i - 1] == Y [j - 1]) arr[i][j] = 1 + arr[i- 1][j - 1];
        else arr[i][j] = Math.max(arr[i-1][j], arr[i][j - 1]); 
      }
    }
    return arr[m][n];
  }

  public static void main(String[] args) {
    System.out.println(longest("AGGTAB", "GXTXAYB"));
  }
}