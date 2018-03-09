import java.util.*;
/*
  Time Complexity: O(n)
*/
class reverseStack {
  public static Stack<Integer> st = new Stack<>();

  public static void insertLast(int x) {
    if (st.isEmpty())
      st.push(x);
    else {
      int a = st.peek();
      st.pop();
      insertLast(x);
      st.push(a);
    }
  }

  public static void reversed() {
    if (st.size() > 0) {
      int x = st.peek();
      st.pop();
      reversed();
      insertLast(x);
    }
  }

  public static void main(String[] args) {
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    reversed();
    System.out.println(st);
  }
}