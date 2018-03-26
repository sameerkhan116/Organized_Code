import java.util.*;

/* 
  Time complexity: O(n)
*/
class nextGreater {
  public static int[] next(int[] findNums, int[] nums) {
    Stack<Integer> st = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();
    int[] res = new int[findNums.length];
    for (int num : nums) {
      while (!st.isEmpty() && num > st.peek()) {
        map.put(st.pop(), num);
      }
      st.push(num);
    }

    for (int i = 0; i < findNums.length; i++) {
      res[i] = map.getOrDefault(findNums[i], -1);
    }
    System.out.println(Arrays.toString(res));
    return res;
  }

  public static void main(String[] args) {
    System.out.println(next(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 }));
  }
}