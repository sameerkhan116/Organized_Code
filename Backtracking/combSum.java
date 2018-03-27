import java.util.*;

/* 
  Time complexity: O(n choose k)
  O(n!/(k! * (n-k)!)*k)

  Explanation:
  ------------
  1. if sum < 0, return;
  2. if sum == 0 add the temp list to res
  3. else from start to length of nums, add nums[i] to templist, backtrack with sum - nums[i], remove last element from templist
*/

class combSum {
  public static List<List<Integer>> combination(int[] nums, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums == null || nums.length == 0)
      return res;
    helper(res, nums, sum, new ArrayList<>(), 0);
    return res;
  }

  public static void helper(List<List<Integer>> res, int[] nums, int sum, List<Integer> temp, int start) {
    if (sum < 0)
      return;
    else if (sum == 0)
      res.add(new ArrayList<>(temp));
    else {
      for (int i = start; i < nums.length; i++) {
        temp.add(nums[i]);
        helper(res, nums, sum - nums[i], temp, i);
        temp.remove(temp.size() - 1);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(combination(new int[] { 2, 4, 6, 10 }, 16));
    System.out.println(combSum(new int[] { 2, 4, 6, 10 }, 16));
    System.out.println(combination(new int[] { 2, 3, 6, 7 }, 7));
  }
}