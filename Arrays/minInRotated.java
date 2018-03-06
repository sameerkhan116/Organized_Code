/*
  Time complexity: O(n)
*/

class minInRotated {
  public static int min(int[] nums) {
    int l = 0, r = nums.length - 1;
    while (l < r) {
      if (nums[l] < nums[r])
        return nums[l];
      int m = l + (r - l) / 2;
      if (nums[m] > nums[r])
        l = m + 1;
      else
        r = m;
    }
    return nums[l];
  }

  public static void main(String[] args) {
    System.out.println(mini(new int[] { 4, 5, 6, 1, 2, 3 }));
  }
}