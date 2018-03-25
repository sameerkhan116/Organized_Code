class canBalance {
  public static boolean balance(int[] nums) {
    int totSum = 0, leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      totSum += nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      leftSum += nums[i];
      totSum -= nums[i];
      if (leftSum == totSum)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(balance(new int[] { 1, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 2, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 10, 10 }));
  }
}