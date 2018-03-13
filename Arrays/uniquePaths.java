/*
  Time complexity: O(m * n) where m is number of rows and n is number of columns
*/

/*
  When n == 0 || m == 0 the function always returns 1 since robot can't go left or up
  For all other cells, the unique path is uniquepath[m-1][n] + uniquePath[m][n-1]
*/

class uniquePaths {
  public static int unique(int m, int n) {
    int[][] arr = new int[m][n];
    for (int i = 0; i < m; i++) {
      arr[i][0] = 1;
    }

    for (int j = 0; j < n; j++) {
      arr[0][j] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
      }
    }
    return arr[m - 1][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(unique(5, 5));
  }
}