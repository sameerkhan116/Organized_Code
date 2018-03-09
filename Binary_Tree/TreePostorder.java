import java.util.*;

/*
  Time complexity: O(n)
*/

class TreePostorder {
  public static List<Integer> Postorder(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    helper(res, root);
    return res;
  }

  public static void helper(List<Integer> res, TreeNode root) {
    if (root == null)
      return;
    helper(res, root.left);
    helper(res, root.right);
    res.add(root.val);
  }
}