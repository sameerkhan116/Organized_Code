import java.util.Stack;

class validSubstring {
  public static int valid(String str) {
    Stack<Integer> st = new Stack<>();
    st.push(-1);
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(')
        st.push(i);
      else {
        st.pop();
        if (!st.empty())
          result = Math.max(result, i - st.peek());
        else
          st.push(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(valid("((()()"));
    System.out.println(valid("()(()))))"));
  }
}