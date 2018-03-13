/*
  Time complexity: O(n)
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
    System.out.println(hammingDistance(1, 4));
  }
}