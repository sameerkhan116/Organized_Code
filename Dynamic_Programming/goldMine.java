import java.util.Arrays;
/* 
  Time complexity: O(mn)
*/

class goldMine {
  public static int gold(int[][] nums) {
    if (nums == null || nums.length == 0 || nums[0].length == 0)
      return 0;
    int m = nums.length, n = nums[0].length;
    int[][] table = new int[m][n];

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < m; j++) {
        int right = (i == n - 1) ? 0 : table[j][i + 1];
        int rightUp = (j == 0 || i == n - 1) ? 0 : table[j - 1][i + 1];
        int rightDown = (j == m - 1 || i == n - 1) ? 0 : table[j + 1][i + 1];

        table[j][i] = nums[j][i] + Math.max(right, Math.max(rightUp, rightDown));
      }
    }
    int max = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        max = Math.max(max, table[i][j]);
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(gold(new int[][] { { 1, 3, 3 }, { 2, 1, 4 }, { 0, 6, 4 } }));
  }
}