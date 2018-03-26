import java.util.Arrays;

/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Loop over each character of the string
  2. res = res * 26 + (a.charAt(i) + 1 - 'A') because at each possible char we can have 26 next character combinations
  3. return res
*/

class colNumber {
  public static int col(String a) {
    int res = 0;
    for (int i = 0; i < a.length(); i++) {
      res = 26 * res + (a.charAt(i) + 1 - 'A');
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(col("AAC"));
  }
}