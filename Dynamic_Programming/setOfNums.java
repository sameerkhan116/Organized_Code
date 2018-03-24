class setOfNums {

  public static int nums(int sum, int[] arr, int n) {
    if (sum == 0)
      return 1;
    else if (sum < 0)
      return 0;
    else if (n < 0)
      return 0;
    else if (sum < arr[n])
      return nums(sum, arr, n - 1);
    else
      return nums(sum - arr[n], arr, n - 1) + nums(sum, arr, n - 1);
  }

  public static void main(String[] args) {
    System.out.println(nums(16, new int[] { 2, 4, 6, 10 }, 3));
  }
}