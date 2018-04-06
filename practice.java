import java.util.*;

class practice {
  public static Set<String> permute(String a) {
    Set<String> res = new HashSet<>();
    helper(res, a, 0, a.length() - 1);
    return res;
  }

  public static void helper(Set<String> res, String a, int l, int r){
    if(l== r) {
      res.add(a);
    }
    else {
      for(int i = l; i <= r; i++){
        a = swap(a, i, l);
        helper(res, a, l + 1, r);
        a = swap(a, i, l);
      }
    }
  }

  public static String swap(String a, int i, int j) {
    char[] x = a.toCharArray();
    char b = x[i];
    x[i] = x[j];
    x[j] = b;
    return String.valueOf(x);
  }

  public static void main(String[] args){
    System.out.println(permute("AABC"));
  }
}