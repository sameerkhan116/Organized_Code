import java.util.*;

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

  public static void main(String[] args) {
    System.out.println(perms("a1b2c3"));
  }
}