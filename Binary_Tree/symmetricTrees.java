/*
  Time complexity: O(n)
*/

class symmetricTrees {
  public static boolean Symmetric(TreeNode t1) {
    if (t1 == null)
      return true;
    return Symmetric(t1.left, t1.right);
  }

  public static boolean Symmetric(TreeNode t1, TreeNode t2) {
    if (t1 == null || t2 == null)
      return t1 == t2;
    if (t1.val != t2.val)
      return false;
    return Symmetric(t1.left, t2.right) && Symmetric(t1.right, t2.left);
  }
}