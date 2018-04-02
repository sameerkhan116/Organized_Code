class Node {
  int data;
  Node left, right;
}

class checkBST {
  public boolean checkBST(Node root) {
    return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  /* 
    Main funtion to check if the tree is a valid BST. Using preorder traversal, check if
    root value is between min and max, if it is check the same for root.left and root.right.
  */
  public boolean checkBST(Node root, int min, int max) {
    if (root == null)
      return true;
    if (root.data < min || root.data > max)
      return false;
    return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
  }
}