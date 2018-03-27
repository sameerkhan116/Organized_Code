import java.util.*;
/*
  Time complexity: O(n log(n))
  Space Complexity: O(n)
*/

class mergeSort {
  public static int[] merge(int[] nums) {
    s(nums, 0, nums.length - 1);
    return nums;
  }

  public static void s(int[] nums, int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;
      s(nums, l, m);
      s(nums, m + 1, r);
      m(nums, l, m, r);
    }
  }

  public static void m(int[] nums, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int[] a = new int[n1];
    int[] b = new int[n2];

    for (int i = 0; i < n1; i++)
      a[i] = nums[l + i];
    for (int j = 0; j < n2; j++)
      b[j] = nums[j + m + 1];

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
      if (a[i] < b[j]) {
        nums[k] = a[i++];
      } else
        nums[k] = b[j++];
      k++;
    }

    while (i < n1)
      nums[k++] = a[i++];
    while (j < n2)
      nums[k++] = b[j++];
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(ss(new int[] { 2, 5, 2, 1, 6, 2, 4, 5 })));
  }
}