
/*
  Time complexity: O(n)
*/

import java.util.*;

class minMovesToEqualArr {
  public static int min(int[] nums) {
    Arrays.sort(nums);
    int sum = 0, i = 0, j = nums.length - 1;
    while (i < j) {
      sum += nums[j--] - nums[i++];
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(min(new int[] { 1, 2, 3, 4 }));
  }
}