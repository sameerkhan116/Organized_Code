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
