
/* 
  Time complexity: O(n)

  Explanation:
  ------------
  1. Get total of the array
  2. Loop over the array add current to left tot and subtract from tot.
  3. If at any point the two are same then can balance, else false
*/
class canBalance {
  public static boolean balance(int[] nums) {
    int totSum = 0, leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      totSum += nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      leftSum += nums[i];
      totSum -= nums[i];
      if (leftSum == totSum)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(balance(new int[] { 1, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 2, 1, 1, 2, 1 }));
    System.out.println(balance(new int[] { 10, 10 }));
  }
}