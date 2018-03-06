import java.util.*;

class stockSpan {
  public static int[] stocks(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] S = new int[arr.length];
    stack.push(0);
    S[0] = 1;

    for (int i = 1; i < arr.length; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
        stack.pop();
      S[i] = stack.empty() ? (i + 1) : (i - stack.peek());
      stack.push(i);
    }
    return S;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(stocks(new int[] { 100, 80, 60, 70, 60, 75, 85 })));
  }
}