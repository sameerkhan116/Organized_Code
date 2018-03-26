/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Get two ints prevNo and prevYes
  2. Loop over all elements of given house
  3. if current house is odd numbered, prevYes = max(prevYes + num, prevNo);
  4. If current house is even numbered, prevNo = max(prevNo + num, prevYes);
  5. Return max of prevNo and prevYes
*/

class houseRobber {
  public static int rob(int[] nums) {
    int prevNo = 0, prevYes = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0)
        prevNo = Math.max(prevNo + nums[i], prevYes);
      else
        prevYes = Math.max(prevNo, prevYes + nums[i]);
    }
    return Math.max(prevNo, prevYes);
  }

  public static void main(String[] args) {
    System.out.println(rob(new int[] { 1, 2, 3, 4, 5, 6 }));
  }
}