import java.util.Arrays;

/*
  Time complexity: O(m * n); m -> Number of rows, n -> number of columns
*/
class maxSizeSubMatrix {
  public static void maxSize(int[][] nums) {
    int m = nums.length, n = nums[0].length;
    int S[][] = new int[m][n];

    for (int i = 0; i < m; i++) {
      S[i][0] = nums[i][0];
    }

    for (int j = 0; j < n; j++) {
      S[0][j] = nums[0][j];
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (nums[i][j] == 1)
          S[i][j] = Math.min(S[i][j - 1], Math.min(S[i - 1][j], S[i - 1][j - 1])) + 1;
        else
          S[i][j] = 0;
      }
    }

    int max_S = S[0][0], max_i = 0, max_j = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (max_S < S[i][j]) {
          max_S = S[i][j];
          max_i = i;
          max_j = j;
        }
      }
    }

    for (int i = max_i; i > max_i - max_S; i--) {
      for (int j = max_j; j > max_j - max_S; j--) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    int[][] matrix = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
        { 0, 0, 0, 0, 0 } };
    maxSize(matrix);
  }
}