import java.util.*;
/*
  Time complexity: O(m) where m is the number of rows
*/
class uniqueRows {
  public static Set<String> unique(int[][] arr) {
    Set<String> st = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      st.add(Arrays.toString(arr[i]));
    }
    return st;
  }

  public static void main(String[] args) {
    int[][] arr = new int[][] { { 0, 1, 0, 0, 1 }, { 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 1 }, { 1, 1, 1, 0, 0 } };
    System.out.println(unique(arr));
  }
}
