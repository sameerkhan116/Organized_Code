import java.util.Stack;

/*
  Time Complexity: O(n)
*/
class arrayAsBST {
  public static boolean canRepresent(int[] nums) {
    int n = nums.length;
    Stack<Integer> st = new Stack<>();
    int root = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (nums[i] < root)
        return false;
      while (!st.isEmpty() && st.peek() < nums[i]) {
        root = st.peek();
        st.pop();
      }
      st.push(nums[i]);
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(canRepresent(new int[] { 40, 30, 35, 80, 100 }));
    System.out.println(canRepresent(new int[] { 40, 30, 35, 20, 80, 100 }));
  }
}