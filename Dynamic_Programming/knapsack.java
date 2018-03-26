import java.util.*;
/* 
  Time complexity:  O(mn)
*/

class knapsack {
  
  public static int KS(int W, int[] wt, int[] val, int n) {
    if(wt == null || wt.length == 0 || val == null || val.length == 0 || n == 0 || W == 0) return 0;
    int[][] arr = new int[n + 1][W + 1];

    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= W; j++) {
        if(i == 0 || j == 0) arr[i][j] = 0;
        else if(wt[i-1] <= j) {
          arr[i][j] = Math.max(val[i-1] + arr[i-1][j-wt[i-1]], arr[i-1][j]);
        }
        else arr[i][j] = arr[i-1][j];
      }
    }
    System.out.println(Arrays.deepToString(arr));
    return arr[n][W];
  }

  public static void main(String[] args) {
    System.out.println(KS(10, new int[] { 1, 2, 4, 2, 5 }, new int[] { 5, 3, 5, 3, 2 }, 5));
    System.out.println(KS(50, new int[] { 10, 20, 30 }, new int[] { 60, 100, 120 }, 3));
  }
}