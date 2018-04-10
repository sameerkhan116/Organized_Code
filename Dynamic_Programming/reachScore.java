import java.util.Arrays;

/* 
  Time complexity: O(mn) where m is the size of the array and n is sum
*/

class reachScore {
  public static int reachScore(int[] points, int score) {
    int[] dp = new int[score + 1];
    dp[0] = 1;
    for (int point : points) {
      for (int j = point; j <= score; j++) {
        dp[j] += dp[j - point];
      }
    }
    return dp[score];
  }

  public static void main(String[] args) {
    System.out.println(reachScore(new int[] { 3, 5, 10 }, 13));
  }
}