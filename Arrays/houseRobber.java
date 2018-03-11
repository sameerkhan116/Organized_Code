/*
  Time Complexity: O(n)
*/

class houseRobber {
  public static int rob(int[] nums) {
    int prevNo = 0, prevYes = 0;
    for (int n : nums) {
      int temp = prevNo;
      prevNo = Math.max(prevNo, prevYes);
      prevYes = n + temp;
    }
    return Math.max(prevNo, prevYes);
  }

  public static void main(String[] args) {
    System.out.println(rob(new int[] { 1, 2, 3, 4, 5, 6 }));
  }
}