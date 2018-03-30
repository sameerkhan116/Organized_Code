import java.util.*;

class kthSmallestInBST {
  public int kthSmallest(TreeNode root, int k) {
    List<Integer> list = new ArrayList<>();
    helper(list, root, k);
    return list.get(k - 1);
  }

  public static void helper(List<Integer> res, TreeNode root, int k) {
    if (root == null)
      return;
    helper(res, root.left, k);
    res.add(root.val);
    helper(res, root.right, k);
  }
}