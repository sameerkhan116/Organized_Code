/*
  Time complexity: O(n)

  Explanation:
  ------------
  1. l = 0, r = arr.length - 1
  2. while l < r
    • calc mid  
    • if arr[mid] >= arr[r] l = mid + 1
    • else r = mid
  3. return l
*/

class minInRotated {
  public static int minR(int[] nums) {
    int l = 0, r = nums.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (nums[m] >= nums[r])
        l = m + 1;
      else
        r = m;
    }
    return nums[l];
  }

  public static void main(String[] args) {
    System.out.println(minR(new int[] { 4, 5, 6, 1, 2, 3 }));
  }
}