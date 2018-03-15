class beautifulArrange {
  static int count = 0;

  public static int arrange(int N) {
    if (N == 0)
      return 0;
    int[] nums = new int[N + 1];
    for (int i = 0; i <= N; i++) {
      nums[i] = i;
    }
    helper(nums, N);
    return count;
  }

  public static void helper(int[] nums, int start) {
    if (start == 0) {
      count++;
      return;
    }

    for (int i = start; i > 0; i--) {
      swap(nums, start, i);
      if (nums[start] % start == 0 || start % nums[start] == 0)
        helper(nums, start - 1);
      swap(nums, i, start);
    }

  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    System.out.println(arrange(2));
    System.out.println(arrange(5));
  }
}