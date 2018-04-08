/* 
  Time Complexity: O(mn)
  Space Complexity: O(n^2)
*/
class longestCommonSubseq {

  public static int LCS(String a, String b){
    int[][] dp = new int[a.length() + 1][b.length() + 1];
    for(int i = 1; i <= a.length(); i++) {
      for(int j = 1; j <= b.length(); j++) {
        if(a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = 1 + dp[i-1][j-1];
        else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
      }
    }
    return dp[a.length()][b.length()];
  }

  public static void main(String[] args) {
    System.out.println(LCS("AGGTAB", "GXTXAYB"));
  }
}