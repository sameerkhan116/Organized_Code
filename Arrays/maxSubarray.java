class maxSubarray {
  public static int maxSubarray(int[] nums) {
    int maxsofar = nums[0], maxhere = nums[0];
    for(int i = 1; i < nums.length; i++) {
      maxhere = Math.max(nums[i], maxhere + nums[i]);
      maxsofar = Math.max(maxsofar, maxhere);
    }
    return maxsofar;
  }

  public static void main(String[] args) {
    System.out.println(maxSubarray(new int[]{-1,2,3,5,1,10,11,-8}));
  }
}
