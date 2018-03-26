import java.util.Arrays;

/*
  Time complexity: O(n)

  Explanation:
  ------------
  1. Create a new array to store the merged arrays of length l + m, k = 0
  2. while i < l && j < m:
    • put the smaller one in the new array and increment i/j and k
  3. Do the same for any i or j remaining
  4. Return the new array
*/
class mergeSortedArrs {
  public static int[] m(int[] a, int[] b) {
    int l = a.length, m = b.length;
    int[] res = new int[l + m];

    int i = 0, j = 0, k = 0;
    while (i < l && j < m) {
      if (a[i] < b[j]) {
        res[k++] = a[i++];
      } else
        res[k++] = b[j++];
    }

    while (i < l)
      res[k++] = a[i++];
    while (j < m)
      res[k++] = b[j++];

    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(m(new int[] { 1, 3, 5, 7, 9 }, new int[] { 2, 4, 6, 8 })));
  }
}