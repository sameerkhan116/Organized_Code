import java.util.Arrays;

/*
  Time Complexity: O(n)
*/

class largestOnRight {
  public static int[] largest(int[] nums) {
    int n = nums.length - 1;
    // get current maxRigh and then set it to -1
    // since there are no larger numbers on the right after the last number
    int maxRight = nums[n];
    nums[n] = -1;
    // loop from second last element of array to start
    for(int i = n - 1; i >= 0; i--) {
      // set temp to current element
      int temp = nums[i];
      // set current element to maxRight
      nums[i] = maxRight;
      // if maxRight < temp, set maRight to temp
      if(maxRight < temp) maxRight = temp;
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(largest(new int[]{16,17,4,3,5,2})));
  }
}