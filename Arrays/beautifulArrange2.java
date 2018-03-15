import java.util.Arrays;

/*
  Time complexity: O(n)
*/

class beautifulArrange2 {
  public static int[] arrange(int n, int k) {
    int[] res = new int[n];
    int left = 1, right = n;
    for (int i = 0; i < n; i++) {
      res[i] = (k % 2 != 0) ? left++ : right--;
      if (k > 1)
        k--;
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrange(3, 1)));
    System.out.println(Arrays.toString(arrange(3, 2)));
  }
}