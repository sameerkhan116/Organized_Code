import java.util.*;

/*
  Time complexity: O(n)
  
  Explanation:
  ------------
  1. Create a stack and a res array of equal size as given nums
  2. Loop over given array
    • while(!st.isEmpty() && nums[i] >= nums[st.peek()])
      st.pop()
    • res[i] = (if st is empty, then it is greater than all elements on the left -> i + 1 else, i - st.peek())
    • st.push(i);
  3. return res
*/
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
    System.out.println(Arrays.toString(s(new int[] { 100, 80, 60, 70, 60, 75, 85 })));
  }
}