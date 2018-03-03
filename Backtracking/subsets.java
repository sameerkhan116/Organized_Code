import java.util.*;

/*
  Time Complexity: O(n!)
*/

class subsets {
  public static List<List<Integer>> subs(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    helper(res, nums, new ArrayList<>(), 0);
    return res;
  }

  public static void helper(List<List<Integer>> res, int[] nums, List<Integer> cur, int start) {
    res.add(new ArrayList<>(cur));
    for(int i = start; i < nums.length; i++) {
      cur.add(nums[i]);
      helper(res, nums, cur, i + 1);
      cur.remove(cur.size() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(subs(new int[]{1,2,3}));
  }
}