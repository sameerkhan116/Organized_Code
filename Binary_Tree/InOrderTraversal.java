import java.util.ArrayList;
import java.util.List;
/*
  Time complexity: O(n)
*/
class InOrderTraversal {
  public static List<Integer> traversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;
    helper(res, root);
    return res;
  }

  public static void helper(List<Integer> res, TreeNode root) {
    if(root == null) return;
    helper(res, root.left);
    res.add(root.val);
    helper(res, root.right);
  }
}