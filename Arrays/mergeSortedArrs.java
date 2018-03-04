import java.util.Arrays;
/*
  Time complexity: O(n)
*/
class mergeSortedArrs {
  public static int[] merge(int[] a, int[] b) {
    // Get length of both arrays
    int x = a.length - 1, y = b.length - 1;
    // Go over the second array in reverse
    for(int i = y; i >= 0; i--) {
      // last = last element of first array
      int j, last = a[x];
      // go over first array in reverse and check if current element in first array is greater than current element in
      // second array
      for(j = x - 1; j >= 0 && a[j] > b[i]; j--) {
        // if it is then set element at current index + 1 to element at current index
        a[j + 1] = a[j];
      }
      // else if j != x - 1 and last > current element in second array then a[j + 1] = b[i] and b[i] = last 
      if(j != x - 1 || last > b[i]) {
        a[j + 1] = b[i];
        b[i] = last;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new int[]{1,3,5,7,9}, new int[]{2,4,6,8})));
  }
}