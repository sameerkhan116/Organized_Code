import java.util.Arrays;

/* 
  Time complexity: O(mn)
*/
class minCostPath {
  public static int min(int[][] arr) {
    int m = arr.length, n = arr[0].length;
    int[][] TC = new int[m][n];
    TC[0][0] = arr[0][0];

    for (int i = 1; i < m; i++) {
      TC[i][0] = TC[i - 1][0] + arr[i][0];
    }

    for (int j = 1; j < m; j++) {
      TC[0][j] = TC[j - 1][0] + arr[0][j];
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        TC[i][j] = Math.min(TC[i - 1][j - 1], Math.min(TC[i - 1][j], TC[i][j - 1])) + arr[i][j];
      }
    }

    return TC[m - 1][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(min(new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } }));
  }
}