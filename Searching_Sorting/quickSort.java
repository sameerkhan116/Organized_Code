
/*
  Time complexity: O(n log(n)) -> Best case, O(n*n) -> worst case
*/

import java.util.*;

class quickSort {
  public static int[] quick(int[] nums) {
    s(nums, 0, nums.length - 1);
    return nums;
  }

  public static void s(int[] nums, int l, int r) {
    if (l < r) {
      int pi = p(nums, l, r);
      s(nums, l, pi - 1);
      s(nums, pi + 1, r);
    }
  }

  public static int p(int[] nums, int l, int r) {
    int i = l - 1;
    int pivot = nums[r];
    for (int j = l; j < r; j++) {
      if (nums[j] <= pivot) {
        i++;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
    int temp = nums[i + 1];
    nums[i + 1] = nums[r];
    nums[r] = temp;
    return i + 1;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(qs(new int[] { 2, 5, 2, 1, 6, 2, 4, 5 })));
  }
}