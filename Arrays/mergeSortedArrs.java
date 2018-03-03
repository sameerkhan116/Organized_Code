import java.util.Arrays;

class mergeSortedArrs {
  public static int[] merge(int[] a, int[] b) {
    int x = a.length - 1, y = b.length - 1;
    for(int i = y; i >= 0; i--) {
      int j, last = a[x];
      for(j = x - 1; j >= 0 && a[j] > b[i]; j--) {
        a[j + 1] = a[j];
      }
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