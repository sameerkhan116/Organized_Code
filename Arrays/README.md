# Arrays

Time Complexity :

| Average / Worst |
| :-------------: |
|  Access: O(1)   |
|  Search: O(n)   |
| Insertion: O(n) |
| Deletion: O(n)  |

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

### Algo for merging sorted arrays in place

```pseudocode
  Iterate over every element of arr2 starting from the end. For every element:
    a) Store last element of arr1 as last
    b) Loop from last element of arr1 while element arr1[j] is less than arr2[j]
      arr1[j + 1] = arr1[j]
      j--
    c) if any element of arr1[] was moved or j != m - 1
      arr1[j + 1] = arr2[i]
      arr2[i] = last
```

### Algo to check the minimum distance between two characters in an array

```pseudocode
  init min = 0
  Loop over the array
  If arr[i] == first char, min1 = i
  If arr[i] == second char, min2 = i
  if(min1 != -1 && min2 != -1)
    int dist = Math.abs(min1 - min2)
    if(dist == 0 || dist < min) min = dist
  return min
```

### Algo for max size sub matrix with all 1

```psuedocode
  init an empty array (S) of the same size as given array
  Add first row and col to S
  for the remaining rows and cols:
    if(nums[i][j] == 1) S[i][j] = Math.min(S[i][j-1], Math.min(S[i-1][j-1], S[i -1][j])) + 1;
    else S[i][j] = 0
  Init get maxs, maxi and maxj from S[i][j] by looping over all of its values
  For(i = maxi; i > maxi - maxs; i--):
    For(j = maxj; j > maxj - maxs; j--)
      sysout(nums[i][j] + " ")
    sysout();
```

### Algo for max element on the right

```pseudocode
  Set n = arr.length - 1
  Set maxRight = nums[n]
  nums[n] = -1, since there is no larger element to its right
  Loop over array in reverse from second last element
    temp = nums[i];
    nums[i] = maxright;
    if(temp > maxright) maxright = temp
  return nums
```

### Algo for finding kthSmallestElement in sorted array

```pseudocode
  Set m = nums.length - 1, n = nums[0].length - 1
  Set lo = 0, hi = nums[m][n] + 1
  while(lo < hi)
    mid = lo + (hi - lo) / 2
    int count = 0, j = n
    Loop from i = 0 to m
      while j >= 0 && matrix[i][j] > mid
        decrement j
      count += j + 1
    if count < required k
      lo = mid + 1
    else
      hi = mid
  Return lo
```
