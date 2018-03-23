/*
  Time Complexity: O(log(n))
*/

class searchInRotated {
  public static int search(int[] nums, int k) {
    int l = 0, r = nums.length - 1;
    while(l < r) {
      int m = l + (r-l)/2;
      if(nums[m] == k) return m;
      if(nums[l] <= nums[m]) {
        if(k >= nums[l] && k <= nums[m]) {
          r = m;
        }
        else l = m + 1;
      }
      else {
        if(k >= nums[m] && k <= nums[r]) {
          l = m ;
        }
        else r = m - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[] { 4, 5, 6, 1, 2, 3 }, 1));
  }
}