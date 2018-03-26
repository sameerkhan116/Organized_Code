/*
  Time Complexity; O(n)

  Explanation:
  ------------
  1. Get two variable first and second and set larger of first 2 to first and other to second
  2. Loop over all elems of array
    • If arr[i] > first: second = first, first = arr[i]
    • else if arr[i] > second: second = arr[i]
  3. return first + second
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
    System.out.println(large(new int[] { 12, 34, 10, 6, 40, -12, -35 }));
  }
}