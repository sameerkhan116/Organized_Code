import java.util.*;

/* 
  Time complexity: O(n)
*/

class dailyTemps {
  public static int[] daily(int[] temp) {
    int m = temp.length - 1, days = 0;
    Stack<Integer> st = new Stack<>();
    int[] res = new int[m + 1];
    for (int i = 0; i <= m; i++) {
      while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
        int id = st.pop();
        res[id] = i - id;
      }
      st.push(i);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(daily(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })));
  }
}