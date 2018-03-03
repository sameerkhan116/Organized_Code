import java.util.Arrays;

class prodExceptSelf {
  public static int[] prod(int[] nums) {
    if(nums == null || nums.length == 0) return nums;
    int[] res = new int[nums.length];
    int temp = 1;
    for(int i = 0; i < nums.length; i++) {
      res[i] = temp;
      temp *= nums[i];
    }
    temp = 1;
    for(int i = nums.length - 1; i >= 0; i--) {
      res[i] *= temp;
      temp *= nums[i];
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(prod(new int[]{1, 2, 3, 4})));
  }
}