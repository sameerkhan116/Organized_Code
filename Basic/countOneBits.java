/*
  Time complexity: O(1) since 32 is constant

  Explanation:
  ------------
  1. To count number of 1 bits, loop from 0 to 32.
    • count += num >> i & 1
  2. return count
*/

class countOneBits {
  public static int countone(int n) {
    int count = 0;
    for (int i = 0; i < 32; i++) {
      count += (n >> i & 1);
    }
    return count;
  }

  public static int hammingDistance(int x, int y) {
    int count = 0;
    int cur = x ^ y;
    for (int i = 0; i < 32; i++) {
      count += cur >> i & 1;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countone(11));
  }
}