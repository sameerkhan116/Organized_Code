class nthNumber {
  public static int find(int[] nums, int n) {
    int l = 0, r = nums.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (m == n)
        return nums[m];
      if (m < n) {
        l = m + 1;
      } else
        r = m;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 14, 15 }, 10));
  }
}