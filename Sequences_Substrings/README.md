# Questions related to Sequences and Subsequences

### Algo for longest increasing subsequence

```pseudocode
  Init a tail array of equal size as given array, size = 0
  Loop over all elements of given array
    i = 0, j = size
    While i != j
      int m = i + (j - i) / 2
      if tails[m] < current element in array
      i = m + 1, else j = m
    tails[i] = x
    if(i == size) size++;
  Return size
```
