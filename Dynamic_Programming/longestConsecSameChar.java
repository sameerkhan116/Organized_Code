/* 
  Time complexity: O(n)
*/

class longestConsecSameChar {
  public static int max(String a) {
    char maxChar = a.charAt(0), prevChar = a.charAt(0);
    int maxCount = 0, count = 0;
    for (char c : a.toCharArray()) {
      if (prevChar == c)
        count++;
      else
        count = 1;
      if (count > maxCount) {
        maxCount = count;
        maxChar = c;
      }
      prevChar = c;
    }
    System.out.println(maxChar);
    return maxCount;
  }

  public static void main(String[] args) {
    System.out.println(max("AABCDDBBBBEEEEEE"));
  }
}