import java.util.*;
/*
  Time Complexity: O(n)
*/

class parentheses {
  public static List<String> parens(int n) {
    List<String> res = new ArrayList<>();
    helper(res, "", 0, 0, n);
    return res;
  }

  public static void helper(List<String> res, String str, int open, int close, int n) {
    if (str.length() == n * 2) {
      res.add(str);
      return;
    }
    if (open < n)
      helper(res, str + "(", open + 1, close, n);
    if (close < open)
      helper(res, str + ")", open, close + 1, n);
  }

  public static List<String> p(int n) {
    List<String> res = new ArrayList<>();
    help(res, "", 0, 0, n);
    return res;
  }p(res, a + ")", i, j + 1, n);
  }

  public static void main(String[] args) {
    System.out.println(p(3));
  }
}