import java.util.*;

/* 
  Time complexity: O(n)

  Explanation:
  ------------
  1. Create stack to store the number of days and an array to store hotter days.
  2. Loop over each element in the array.
    • while stack is not empty and curr day is hotter than last day in stored in stack
      º id = st.pop();
      º res[id] = i - id;
    • st.push(i)
  3. return res
*/

class dailyTemps {
  public static int[] daily(int[] temp) {
    int m = temp.length - 1;
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
    System.out.println(Arrays.toString(d(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })));
  }
}