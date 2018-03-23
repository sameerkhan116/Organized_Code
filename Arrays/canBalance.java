class canBalance {
  public static boolean balance(int[] nums) {
    int a = 0, tot = 0, count = 0;

    for (int i = 0; i < nums.length; i++) {
      tot += nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      if (a + nums[i] == tot - nums[i])
        count++;
      a += nums[i];
      tot -= nums[i];
    }
    return count > 0;
  }

  public static void main(String[] args) {
    System.out.println(balance(new int[] { 1, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 2, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 10, 10 }));
  }
}