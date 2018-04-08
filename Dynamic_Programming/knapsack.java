import java.util.*;
/* 
  Time complexity:  O(mn)
*/

class knapsack {
  
  public static int knapsack(int W, int[] wt, int[] val) {
    int n = wt.length;
    int[][] dp = new int[n + 1][W + 1];
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= W; j++) {
        if(wt[i - 1] <= j) dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - wt[i - 1]]);
        else dp[i][j] = dp[i - 1][j];
      }
    }
    return dp[n][W];
  }

  public static void main(String[] args) {
    System.out.println(knapsack(10, new int[] { 1, 2, 4, 2, 5 }, new int[] { 5, 3, 5, 3, 2 }));
    System.out.println(knapsack(50, new int[] { 10, 20, 30 }, new int[] { 60, 100, 120 }));
  }
}