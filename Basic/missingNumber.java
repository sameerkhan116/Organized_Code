/*
  Time complexity: O(n)

  Explanation:
  ------------
  1. Get total sum using (n*n + n) / 2
  2. Loop over array and subtract from sum, remaining is what we are missing
*/

class missingNumber {
  public static int missing(int[] nums) {
    int n = nums[nums.length - 1] - nums[0];
    int sum = (n * (n + 1)) / 2;
    for (int i = 0; i < nums.length; i++) {
      sum -= nums[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(missing(new int[] { 0, 1, 3, 4 }));
  }
}