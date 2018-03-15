/*
  Time complexity: O(m*m*n)
*/

class kthSmallestInSorted {
  public static int smallest(int[][] matrix, int k) {
    int m = matrix.length - 1, n = matrix[0].length - 1;
    int lo = matrix[0][0], hi = matrix[m][n] + 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = 0, j = n;
      for (int i = 0; i <= m; i++) {
        while (j >= 0 && matrix[i][j] > mid)
          j--;
        count += j + 1;
      }
      if (count < k)
        lo = mid + 1;
      else
        hi = mid;
    }
    return lo;
  }

  public static void main(String[] args) {
    System.out.println(small(new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } }, 8));
  }
}