import java.util.Arrays;

class magicSquare {
  public static int valid(int[][] square) {
    int m = square.length, n = square[0].length;
    boolean[][] table = new boolean[(m - 3) + 1][(n - 3) + 1];
    int x = 0, y = 0, count = 0;
    while (x < m - 3) {
      while (y < n - 3) {
        table[x][y] = (row(square, x, y) && cols(square, x, y) && ld(square, x, y) && rd(square, x, y));
        y++;
      }
      x++;
    }

    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        if (table[i][j] == true)
          count++;
      }
    }

    return count;
  }

  public static boolean row(int[][] nums, int x, int y) {
    int cur = 0;
    for (int i = x; i < x + 3; i++) {
      cur = nums[i][y] + nums[i][y + 1] + nums[i][y + 2];
    }
    return cur == 15;
  }

  public static boolean cols(int[][] nums, int x, int y) {
    int cur = 0;
    for (int j = y; j < y + 3; j++) {
      cur = nums[x][j] + nums[x + 1][j] + nums[x + 2][j];
    }
    return cur == 15;
  }

  public static boolean ld(int[][] nums, int x, int y) {
    return (nums[x][y] + nums[x + 1][y + 1] + nums[x + 2][y + 2] == 15);
  }

  public static boolean rd(int[][] nums, int x, int y) {
    return (nums[x + 2][y] + nums[x + 1][y + 1] + nums[x][y + 2] == 15);
  }

  public static void main(String[] args) {
    System.out.println(
        valid(new int[][] { { 6, 7, 2, 7, 6, 5 }, { 1, 5, 9, 5, 1, 5 }, { 8, 3, 4, 3, 8, 5 }, { 5, 5, 5, 5, 5, 5 } }));
  }
}