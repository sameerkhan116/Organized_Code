import java.util.ArrayList;
import java.util.List;

/*
  Time Complexity: O(n!)
*/

class permsOfString {
  public static List<String> perms(String a) {
    // initialize a List to store the permutations
    List<String> res = new ArrayList<>();
    // use the helper function to add string permutations to list
    helper(res, 0, a.length() - 1, a);
    return res;
  }

  public static void helper(List<String> res, int l, int r, String a) {
    // if current index is equal to last index, add string permutation to list
    if(l == r) res.add(a);
    else {
      // otherwise loop from current index to last index of string
      for(int i = l; i <= r; i++) {
        // swap characters at current index and i in loop
        a = swap(a, l, i);
        // recursively call the helper function with incremented curr index
        helper(res, l+1, r, a);
        // swap curr index and i back again to get the same string (backtracking)
        a = swap(a, l, i);
      }
    }
  }

  public static String swap(String str, int i, int j) {
    // converting string to char array
    char[] x = str.toCharArray();
    // swap the required chars
    char temp = x[i];
    x[i] = x[j];
    x[j] = temp;
    // return the swapped string
    return String.valueOf(x);
  }

  public static void main(String[] args) {
    System.out.println(perms("ABCD"));
  }
}