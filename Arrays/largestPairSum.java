/*
  Time Complexity; O(n)
*/

class largestPairSum {
  public static int largest(int[] nums) {
    int first, second;
    if (nums[0] < nums[1]) {
      first = nums[1];
      second = nums[0];
    } else {
      first = nums[1];
      second = nums[0];
    }
    for (int i = 2; i < nums.length; i++) {
      if (nums[i] > first) {
        second = first;
        first = nums[i];
      } else if (nums[i] > second)
        second = nums[i];
    }
    return first + second;
  }

  public static void main(String[] args) {
    System.out.println(largest(new int[] { 12, 34, 10, 6, 40, -12, -35 }));
  }
}