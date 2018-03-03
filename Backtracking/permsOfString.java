import java.util.ArrayList;
import java.util.List;

/*
  Time Complexity: O(n!)
*/

class permsOfString {
  public static List<String> perms(String a) {
    List<String> res = new ArrayList<>();
    helper(res, 0, a.length() - 1, a);
    return res;
  }

  public static void helper(List<String> res, int l, int r, String a) {
    if(l == r) res.add(a);
    else {
      for(int i = l; i <= r; i++) {
        a = swap(a, l, i);
        helper(res, l+1, r, a);
        a = swap(a, l, i);
      }
    }
  }

  public static String swap(String str, int i, int j) {
    char[] x = str.toCharArray();
    char temp = x[i];
    x[i] = x[j];
    x[j] = temp;
    return String.valueOf(x);
  }

  public static void main(String[] args) {
    System.out.println(perms("ABCD"));
  }
}