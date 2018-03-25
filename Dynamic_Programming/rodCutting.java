import java.util.Arrays;

/* 
  Time complexity: O(n*n)
*/
class rodCutting {
  public static int cut(int len, int[] p) {
    int[] val = new int[len + 1];
    val[0] = 0;
    for (int i = 1; i <= len; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++) {
        max = Math.max(max, p[j] + val[i - j - 1]);
        val[i] = max;
      }
    }
    System.out.println(Arrays.toString(val));
    return val[len];
  }

  public static void main(String[] args) {
    System.out.println(cut(8, new int[] { 1, 5, 8, 9, 10, 17, 17, 20 }));
  }
}