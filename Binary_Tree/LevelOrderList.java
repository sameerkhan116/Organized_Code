import java.util.*;

/*
  Time Complexity: O(n)
  Space Complexity: O(n)
*/

class LevelOrderList {
  public List<List<Integer>> LevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    helper(res, root, 0);
    return res;
  }

  public void helper(List<List<Integer>> res, TreeNode root, int b) {
    if (root == null)
      return;

    if (b >= res.size())
      res.add(new ArrayList<>());

    List<Integer> cur = res.get(b);
    cur.add(root.val);

    helper(res.root.left, b + 1);
    helper(res.root.right, b + 1);
  }
}