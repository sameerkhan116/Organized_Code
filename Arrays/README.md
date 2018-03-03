# Arrays

Time Complexity :

Average / Worst |
---------|
Access: O(1) | 
Search: O(n) |
Insertion: O(n) |
Deletion: O(n) |

Spave Complexity: O(n)
 

### Algo for calculating longest span of equal sum in a binary array

```pseudocode
  Create a new array to store the difference in span.
  Maintain two variables to store sum for both arrays. 
  Loop over the array adding each element from array to respective variables.
    Set current diff = sum of first array - sum of second array
    The difference index is n + current diff
    If current difference is 0, then maxlen = current Index + 1
    Else 
      If current difference is being seen for the first time (diff[diffIndex]) = -1, set current index to i in diff array.
    Else
      len = currentIndex - diff[diffIndex]
      if this len is greater than maxlen then set maxlen to len
  Return the maxLen
```

### Algo for product except self for an array

```pseudocode
  Create a temp variable equal to 1 and res array for result
  Loop over array
    Set res[i] = temp
    temp *= nums[i]
  Set temp equal to 1
  Loop over the array in reverse
    res[i] *= temp
    temp *= nums[i]
  return res
```