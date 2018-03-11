/*
  Calculate number of distinct ways to climb stairs when you can take either 1 step or 2 steps
  Time complexity: O(n)
*/

class climbStairs {
  public static int stairs(int n) {
    // when n is less than 2 then there are only as many ways to climb stairs
    if (n <= 2)
      return n;
    // possible ways to climb with 1 step - 2
    // possible ways to climb in two steps - 1
    int one_step = 2, two_step = 1, all_way = 0;
    for (int i = 2; i < n; i++) {
      // all way is one step to two step
      all_way = one_step + two_step;
      two_step = one_step;
      one_step = all_way;
    }
    return all_way;
  }

  public static void main(String[] args) {
    System.out.println(stairs(3));
  }
}