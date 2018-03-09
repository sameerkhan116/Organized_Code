# Binary Tree

Time Complexity :

|   Average / Worst    |
| :------------------: |
|  Access: O(log(n))   |
|  Search: O(log(n))   |
| Insertion: O(log(n)) |
| Deletion: O(log(n))  |

Space Complexity: O(n)

### Algo for calculating max depth of a binary tree

```pseudocode
  If root is null, return 0
  Recursively call 1 + Math.max(maxDepth(root.left), maxDepth(root.right))
```

### Algo for mergin two binary trees

```pseudocode
  If t1 is null, return t2
  If t2 is null, return t1
  Else
    a) t1.val += t2.val
    b) t1.left = merge(t1.left, t2.left)
       t1.right = merge(t1.right, t2.right)
  Return t1
```

### Algo to check if a tree is symmetric

```pseudocode
  If t1 is null, return false
  Else
    a) Return if they are symmetric at t1.left, t1.right recursively
```

### Algo for converting a **sorted** array to BST

```pseudocode
  CreateTree by passing TreeNode root (= null initially), the array, l = starting index(0) and r = array.length to a helper function.
  In the helper function:
  If(l > r)
    return root
  Else
    a) mid = l + (r-l) / 2
    b) TreeNode head = new TreeNode(nums[m])
    c) node.left = helper(node.left, nums, l, m);
    d) node.right = helper(node.right, nums, m + 1, r);
    Return node
```
