# Binary Tree

Time Complexity :

Average / Worst |
:---------:|
Access: O(log(n)) | 
Search: O(log(n)) |
Insertion: O(log(n)) |
Deletion: O(log(n)) |

Space Complexity: O(n)

### Algo for calculating max depth of a binary tree

```pseudocode
  If root is null, return 0
  Recursively call 1 + Math.max(maxDepth(root.left), maxDepth(root.right))
```