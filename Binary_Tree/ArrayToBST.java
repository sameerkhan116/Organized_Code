/*
  Time complexity: O(n log(n))
  Note: Given array needs to be sorted or should be sorted before inputting in array
*/

class ArrayToBST {
  public TreeNode sortedArrayToBST(int[] nums) {
    return createTree(null, nums, 0, nums.length);
  }

  public TreeNode createTree(TreeNode root, int[] nums, int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;
      TreeNode node = new TreeNode(nums[m]);
      node.left = createTree(node.left, nums, l, m);
      node.right = createTree(node.right, nums, m + 1, r);
      return node;
    }
    return null;
  }
}