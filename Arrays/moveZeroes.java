import java.util.Arrays;

/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Get the place where we will be moving the non-zeroes as x
  2. Loop over the array
    • if(arr[i] != 0) swap(x, i);
    • increment x
  3. Return arr
*/
class moveZeroes {
  public static int[] moved(int[] nums) {
    int x = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[x];
        nums[x] = temp;
        x++;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(moved(new int[] { 0, 1, 0, 3, 12 })));
  }
}