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

### Algo for teemo attacking (merge intervals)

```pseudocode
  Check if array is empty or duration of poisoning is 0 and return 0
  Else init result, start = nums[0], end = nums[0] + duration
  Loop over array from 1 to n
    If nums[i] > end
      Add end - start to result
      start = nums[i]
    end = nums[i] + n
  result += end - start
  return result
```

### Algo for min moves to equal two arrays

```pseudocode
  Check if array is valid, otherwise return 0
  Init moves = 0, i = 0, j = nums.length - 1
  Sort array
  while(i < j)
    moves += nums[j--] - nums[i++]
  return moves
```

### Algo for calculating largest Pair sum in an array

```pseudcode
  Comapre first two elements of array
  If first element > second, first = nums[0], second = nums[1] or vice versa
  Loop over array from 2 to end
    if(nums[i] > first)
      second = first
      first = nums[i]
    if(nums[i] > second)
      second = nums[i]
  return new int[first, second]
```

### Algo for finding kth Smallest Element in Multi-dimensional Array

```pseudocode
  Let m -> matrix.length - 1, n -> matrix[0].length - 1
  lo = matrix[0][0], hi = matrix[m][n] + 1
  while lo < hi
    mid = lo + hi / 2
    count = 0, j = n
    Loop from i to m
      while j >= 0 and matrix[i][j] > mid
        j--
      count += j + 1
    if count < k
      lo = mid + 1
    else hi = mid
  return lo
```

### Algo for beautiful arrangement

```pseudocode
  Init empty array of required size
  left = 1, right = n
  for(int i = 0; i < n; i++)
    res[i] = k % 2 != 0 ? left++ : right--;
    if(k > 1) k--
  return res
```
