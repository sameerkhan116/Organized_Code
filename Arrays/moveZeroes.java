import java.util.Arrays;

class moveZeroes {
  public static int[] moved(int[] nums) {
    int x = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[x];
        nums[x] = temp;
        x++;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(moved(new int[]{0,1,0,3,12})));
  }
}