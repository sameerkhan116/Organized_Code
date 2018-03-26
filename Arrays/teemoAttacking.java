/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Set result = 0, start = nums[0], end = nums[0] + n
  2. Loop over array from 1 to length of array
    • If nums[i] > end, result += end - start, start = nums[i]
    • end = nums[i] + n;
  3. result += end - start
  4. return result2
*/

class teemoAttacking {
  public static int find(int[] nums, int n) {
    if (nums == null || nums.length == 0 || n == 0)
      return 0;
    int result = 0, start = nums[0], end = nums[0] + n;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > end) {
        result += end - start;
        start = nums[i];
      }
      end = nums[i] + n;
    }
    result += end - start;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(teemo(new int[] { 1, 4 }, 2));
    System.out.println(teemo(new int[] { 1, 2 }, 2));
  }
}