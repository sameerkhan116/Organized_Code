import java.util.Arrays;

/*
  Time Complexity: O(n)
*/

class colNumber {
  public static int colNumber(String s) {
    int[] arr = new int[s.length()];
    int result = 0;
    for(int i = 0; i < s.length(); i++) {
      result = result*26 + ((int) s.charAt(i) - 64);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(colNumber("AAC"));
  }
}