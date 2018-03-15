import java.util.*;

class mostFreqSubSum {
  Map<Integer, Integer> map;
  int maxCount;

  public List<Integer> maximum(TreeNode root) {
    maxCount = 0;
    map = new HashMap<>();

    helper(root);

    List<Integer> res = new ArrayList<>();

    for (int key : map.keySet()) {
      if (map.get(key) == maxCount) {
        res.add(key);
      }
    }
    return res;
  }

  public int helper(TreeNode root) {
    if (root == null)
      return 0;

    int left = helper(root.left);
    int right = helper(root.right);
    int sum = left + right + root.val;

    int count = map.getOrDefault(sum, 0) + 1;
    map.put(sum, count);
    maxCount = Math.max(maxCount, count);

    return sum;
  }
}