import java.util.*;

/* 
  Explanation:
  ------------
  1. Backtrackin on the given string.
  2. If pos == string.length, res.add(s)
  3. if given char is between 0 and 9 backtrack with pos + 1
  4. Otherwise, change string to char array.
  5. change char at current pos to uppercase and pass this string to backtrackign function
  6. Change char to loewr case and pass this to backtracking function.
*/
class letterCasePermutation {
  public static List<String> perms(String s) {
    List<String> res = new ArrayList<>();
    if (s == null)
      return res;
    helper(s, res, 0);
    return res;
  }

  public static void helper(String s, List<String> res, int pos) {
    if (pos == s.length()) {
      res.add(s);
      return;
    }

    if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
      helper(s, res, pos + 1);
      return;
    }

    char chars[] = s.toCharArray();

    chars[pos] = Character.toUpperCase(chars[pos]);
    helper(String.valueOf(chars), res, pos + 1);

    chars[pos] = Character.toLowerCase(chars[pos]);
    helper(String.valueOf(chars), res, pos + 1);

  }

  public static List<String> list(String s) {

    List<String> res = new ArrayList<>();
    if (s == null || s.length() == 0)
      return res;
    help(s, res, 0);
    return res;
  }

  public static void help(String s, List<String> res, int pos) {
    if (s.length() == pos) {
      res.add(s);
      return;
    }

    if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
      helper(s, res, pos + 1);
    }

    char[] chs = s.toCharArray();

    chs[pos] = Character.toUpperCase(chs[pos]);
    helper(String.valueOf(chs), res, pos + 1);

    chs[pos] = Character.toLowerCase(chs[pos]);
    helper(String.valueOf(chs), res, pos + 1);
  }

  public static void main(String[] args) {
    System.out.println(list("a1b2c3"));
  }
}