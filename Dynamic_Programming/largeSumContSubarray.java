/* 
  Time complexity: O(n)
*/

class largeSumContSubarray {
  public static int large(int[] nums) {
    int maxhere = nums[0], maxsofar = nums[0];
    for (int i = 1; i < nums.length; i++) {
      maxhere = Math.max(nums[i], nums[i] + maxhere);
      maxsofar = Math.max(maxsofar, maxhere);
    }
    return maxsofar;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
    System.out.println(large(nums));
  }
}