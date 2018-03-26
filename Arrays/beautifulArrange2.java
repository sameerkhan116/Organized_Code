import java.util.Arrays;

/*
  Time complexity: O(n)

  Explanation:
  ------------
  1. Create an array to store the list of size equal to given number
  2. Set l = 1, r = given number (n)
  3. Loop from 0 to n
    • If (k % 2) != 0 l++ else r--;
    • If (k > 1) k--;
  4. Return res 
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