/*
  Time complexity: O(m + n)
*/

class negativeChars {
  public static int count(int[][] M) {
    int count = 0;
    int m = M[0].length, n = M.length;
    int i = 0, j = m - 1;
    while (j >= 0 && i < n) {
      if (M[i][j] < 0) {
        count += (j + 1);
        i++;
      } else
        j--;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(count(new int[][] { { -3, -2, -1, 1 }, { -2, 2, 3, 4 }, { 4, 5, 7, 8 } }));
  }
}