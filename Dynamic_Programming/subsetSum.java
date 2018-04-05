import java.util.Arrays;

class subsetSum {
  public static boolean subset(int[] nums, int sum) {
    int n = nums.length;
    boolean[][] table = new boolean[n][sum + 1];

    for (int i = 0; i < n; i++) {
      table[i][0] = true;
    }

    for (int j = 1; j <= sum; j++) {
      if (nums[0] == j)
        table[0][j] = true;
      else
        table[0][j] = false;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= sum; j++) {
        if (nums[i] > j)
          table[i][j] = table[i - 1][j];
        else
          table[i][j] = (table[i - 1][j - nums[i]] || table[i - 1][j]);
      }
    }
    System.out.println(Arrays.deepToString(table));
    return table[n - 1][sum];
  }

  public static void main(String[] args) {
    System.out.println(subset(new int[] { 2, 3, 7, 8, 10 }, 11));
  }
}