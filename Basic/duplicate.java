import java.util.*;

/* 
  Time complexity: O(n)

  Explanation:
  ------------
  set.add adds to set and returns boolean for added or not.
  Loop over array and keep adding to set.
  if !set.add(n) return n
*/

class duplicate {
  public static int dup(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (!set.add(n))
        return n;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(dup(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }));
  }
}