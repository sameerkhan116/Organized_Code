/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Run loop while y != 0
    • carry = x & y
    • x = x ^ y (sum)
    • y = carry << 1
  2. return x
*/

class addingWithoutOp {
  public static int add(int x, int y) {
    while (y != 0) {
      int carry = x & y;
      x ^= y;
      y = carry << 1;
    }
    return x;
  }

  public static void main(String[] args) {
    System.out.println(add(2, 3));
  }
}