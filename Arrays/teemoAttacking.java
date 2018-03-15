/*
  Time Complexity: O(n)
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
    System.out.println(find(new int[] { 1, 4 }, 2));
    System.out.println(find(new int[] { 1, 2 }, 2));
  }
}