public class longestCommonSubseq {
  static int result;

  public static int longest(char[] a, char[] b, int n, int m, int[][] arr) {
    if (arr[n][m] != 0)
      return arr[n][m];
    if (n == 0 || m == 0)
      result = 0;
    else if (a[n - 1] == b[m - 1])
      result = 1 + longest(a, b, n - 1, m - 1, arr);
    else
      result = Math.max(longest(a, b, n - 1, m, arr), longest(a, b, n, m - 1, arr));
    arr[n][m] = result;
    return result;
  }

  public static void main(String[] args) {
    int[][] arr = new int[5][6];
    System.out.println(longest("BATD".toCharArray(), "ABACD".toCharArray(), 4, 5, arr));
  }
}