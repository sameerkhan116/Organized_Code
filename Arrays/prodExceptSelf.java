import java.util.Arrays;

/*
  Time Complexity: O(n)
  Space Complexity: O(n)

  Explanation:
  ------------
  1. Create a new array res of same size as given array. Set temp = 1
  2. First pass over array, res[i] = temp, temp *= nums[i]
  3. Reset temp to 1.
  4. Second pass over res, in reverse, res[i] *= temp, temp *= nums[i];
  5. Return res
*/
class prodExceptSelf {
  public static int[] prod(int[] nums) {
    if (nums == null || nums.length == 0)
      return nums;
    int[] res = new int[nums.length];
    int temp = 1;
    for (int i = 0; i < nums.length; i++) {
      res[i] = temp;
      temp *= nums[i];
    }
    temp = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      res[i] *= temp;
      temp *= nums[i];
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(prod(new int[] { 1, 2, 3, 4 })));
  }
}