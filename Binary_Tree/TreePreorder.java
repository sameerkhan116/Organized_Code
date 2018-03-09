import java.util.*;

/*
  Time complexity: O(n)
*/

class TreePreorder {
  public static List<Integer> Preorder(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    helper(res, root);
    return res;
  }

  public static void helper(List<Integer> res, TreeNode root) {
    if (root == null)
      return;
    res.add(root.val);
    helper(res, root.left);
    helper(res, root.right);
  }
}