import java.util.*;

/* 
  Time complexity: O(rows * cols)
*/

public class maxSizeRect {
  public static int maxSize(int[][] arr) {
    int[] temp = new int[arr[0].length];
    int maxArea = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0)
          temp[j] = 0;
        else
          temp[j] += arr[i][j];
      }
      maxArea = Math.max(maxArea, max(temp));
    }
    return maxArea;
  }

  public static int max(int[] arr) {
    Stack<Integer> st = new Stack<>();
    int maxArea = 0, i;
    for (i = 0; i < arr.length;) {
      if (st.isEmpty() || arr[i] > arr[st.peek()])
        st.push(i++);
      else {
        int top = st.pop();
        if (st.isEmpty()) {
          maxArea = Math.max(maxArea, arr[top] * i);
        } else {
          maxArea = Math.max(maxArea, arr[top] * (i - st.peek() - 1));
        }
      }
    }
    while (!st.isEmpty()) {
      int top = st.pop();
      if (st.isEmpty()) {
        maxArea = Math.max(maxArea, arr[top] * i);
      } else {
        maxArea = Math.max(maxArea, arr[top] * (i - st.peek() - 1));
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    System.out.println(maxSize(
        new int[][] { { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } }));
  }
}