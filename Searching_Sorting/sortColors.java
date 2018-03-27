import java.util.*;
/*
  Time complexity: O(n)
*/

class sortColors {
  public static int[] sort(int[] nums) {
    int n = nums.length;
    int low = 0, high = n - 1;
    for(int i = low; i<= high;) {
      if(nums[i] == 0) {
        int temp = nums[i];
        nums[i] = nums[low];
        nums[low] = temp;
        i++; low++;
      }
      else if(nums[i] == 2) {
        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;
        high--;
      }
      else i++;
    }
    return nums;
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{0,1,2,1,2,0,1,2,0,0,2,1})));
    System.out.println(Arrays.toString(s(new int[]{0,1,2,1,2,0,1,2,0,0,2,1})));
  }
}