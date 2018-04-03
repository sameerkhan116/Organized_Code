import java.util.*;

class maxHistogramArea {
  public static int area(int[] arr) {
    Stack<Integer> st = new Stack<>();

    int maxArea = 0, area = 0, i;
    for (i = 0; i < arr.length;) {
      if (st.isEmpty() || arr[st.peek()] <= arr[i]) {
        st.push(i++);
      } else {
        int top = st.pop();
        if (st.isEmpty())
          area = arr[top] * i;
        else
          area = arr[top] * (i - st.peek() - 1);
        if (area > maxArea)
          maxArea = area;
      }
    }

    while (!st.isEmpty()) {
      int top = st.pop();
      if (st.isEmpty()) {
        area = arr[top] * i;
      } else {
        area = arr[top] * (i - st.peek() - 1);
      }
      if (area > maxArea)
        maxArea = area;
    }
    return maxArea;
  }

  public static void main(String[] args) {
    System.out.println(area(new int[] { 1, 2, 4 }));
    System.out.println(area(new int[] { 2, 1, 2, 3, 1 }));
  }
}