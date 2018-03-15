import java.util.Arrays;

/*
  Time complexity: O(n)
*/
class mergeSortedArrs {
  public static int[] merge(int[] a, int[] b) {
    int m = a.length - 1, n = b.length - 1;
    int k = m + n - 1;

    while (m >= 0 && n >= 0) {
      if (a[m] > b[n])
        a[k--] = a[m--];
      else
        a[k--] = b[n--];
    }

    while (m >= 0)
      a[k--] = a[m--];
    while (n >= 0)
      a[k--] = b[n--];

    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new int[] { 1, 3, 5, 7, 9 }, new int[] { 2, 4, 6, 8 })));
  }
}