/*
  Time Complexity: O(log(n))
*/

class searchInRotated {
  public static int search(int[] nums, int n) {
    return BS(nums, 0, nums.length - 1, n);
  }

  public static int BS(int[] nums, int l, int r, int n) {
    if (l < r) {
      int mid = l + (r - l) / 2;
      if (nums[mid] == n)
        return mid;
      if (nums[l] <= nums[mid]) {
        if (n >= nums[l] && n <= nums[mid]) {
          return BS(nums, l, mid, n);
        }
        return BS(nums, mid + 1, r, n);
      }
      if (n >= nums[mid] && n <= nums[r]) {
        return BS(nums, mid, r, n);
      }
      return BS(nums, l, mid - 1, n);
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[] { 4, 5, 6, 1, 2, 3 }, 1));
  }
}