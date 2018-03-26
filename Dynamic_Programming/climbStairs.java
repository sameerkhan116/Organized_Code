/*
  Calculate number of distinct ways to climb stairs when you can take either 1 step or 2 steps
  Time complexity: O(n)

  Explanation:
  ------------
  Basically this a fibonnaci series.
  count at first step -> 1, count at second step -> 2, count at third step -> 3, count at fourth step -> 5
  1. new table of same size as steps
  2. table[0] = 1, table[1] = 2
  3. for i = 2 to number of stairs
    • table[i] = table[i - 1] + table[i - 2]
  4. return table[n-1]
*/

class climbStairs {
  public static int climb(int n) {
    int[] table = new int[n];
    table[0] = 1;
    table[1] = 2;

    for (int i = 2; i < n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n - 1];
  }

  public static void main(String[] args) {
    System.out.println(climb(4));
  }
}