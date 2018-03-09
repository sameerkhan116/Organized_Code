import java.util.*;

/*
  Time complexity: O(n)
  Space Complexity: O(n)
*/

class TreeLevelOrder {
  public static List<Integer> LevelOrder(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(res, root);
    return res;
  }

  public static void helper(List<Integer> res, TreeNode root) {
    if (root == null)
      return;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode cur = q.poll();
      res.add(cur.val);
      if (cur.left != null)
        q.add(cur.left);
      if (cur.right != null)
        q.add(cur.right);
    }
  }
}