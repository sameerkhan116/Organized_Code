
/* 
  Time Complexity: O(log(n))
*/
class binarySearch {
  public static int BS(int[] nums, int n) {
    int l = 0, r = nums.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (n == nums[m])
        return m;
      else if (n < nums[m])
        r = m - 1;
      else
        l = m + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(BS(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
  }
}