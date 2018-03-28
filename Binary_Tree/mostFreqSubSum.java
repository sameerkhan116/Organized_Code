import java.util.*;

class mostFreqSubSum {

  public List<Integer> maximum(TreeNode root) {
    int maxCount = 0;
    Map<Integer, Integer> map = new HashMap<>();
    helper(root, map, maxCount);

    List<Integer> res = new ArrayList<>();

    for (int key : map.keySet()) {
      if (map.get(key) == maxCount) {
        res.add(key);
      }
    }
    return res;
  }

  public int helper(TreeNode root, Map<Integer, Integer> map, int maxCount) {
    if (root == null)
      return 0;

    int left = helper(root.left, map, maxCount);
    int right = helper(root.right, map, maxCount);
    int sum = left + right + root.val;

    int count = map.getOrDefault(sum, 0) + 1;
    map.put(sum, count);
    maxCount = Math.max(maxCount, count);

    return sum;
  }
}