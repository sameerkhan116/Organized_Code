/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. A number XOR'd with itself is zero
*/

class SingleNumber {
  public static int single(int[] nums) {
    int curr = nums[0];
    for (int i = 1; i < nums.length; i++) {
      curr ^= nums[i];
    }
    return curr;
  }

  public static void main(String[] args) {
    System.out.println(single(new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 4 }));
  }
}