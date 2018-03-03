/*
  Time Complexity: O(n) since it will have to reach deepest leaf to get max depth
*/
public class maxDepth {

  public static int maxDepth(TreeNode root) {
    if(root == null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}