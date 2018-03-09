import java.util.*;

class TreeInorder {
  public static List<Integer> Inorder(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    helper(res, root);
    return res;
  }

  public static void helper(List<Integer> res, TreeNode root) {
    if (root == null)
      return;
    helper(res, root.left);
    res.add(root.val);
    helper(res, root.right);
  }
}