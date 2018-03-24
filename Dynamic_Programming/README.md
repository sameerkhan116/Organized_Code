### Dynamic Programming

An algorithmic paradigm that solves a given complex problem by breaking it into subproblems and stores the result of the subproblem to avoid computing the same results again. The two main properties of problems that can be solved using DP are:

1.  Overlapping Subproblems
2.  Optimal Substructure

Dynamic Programming is mainly used when solutions of same subproblems are needed again and again. In dynamic programming, computed solutions to subproblems are stored in a table so that these don’t have to recomputed.

Memoization (Top Down): The memoized program for a problem is similar to the recursive version with a small modification that it looks into a lookup table before computing solutions. We initialize a lookup array with all initial values as NIL. Whenever we need solution to a subproblem, we first look into the lookup table. If the precomputed value is there then we return that value, otherwise we calculate the value and put the result in lookup table so that it can be reused later.

A given problems has Optimal Substructure Property if optimal solution of the given problem can be obtained by using optimal solutions of its subproblems.

### Algo for editDistance

```pseudocode
  Set m = s1.length, n = s2.length
  Init new array arr[m + 1][n + 1]
  Set first row and col equal to i and j respectively

  For(int i = 0; i <= m; i++) arr[i][0] = i;
  For(int i = 0; i <= n; i++) arr[0][i] = i;

  For(int i = 1; i <= m; i++)
    For(int j = 1; j <= n; j++)
      int cost = s1.charAt(i - 1) == s2.charAt(i - 1) ? 0 : 1;
      arr[i][j] = Math.min(arr[i-1][j] + 1, arr[i][j-1] + 1, arr[i-1][j-1] + cost);

  Return arr[m][n]
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

### Algo for finding unique paths in a maze (Standard DP Question)

```pseudocode
  Init new array of size m and n (m and n given as rows and columns)
  For i from 0 to m
    arr[i][0] = 1
  For i from 0 to n
    arr[0][i] = 1
  For i from 1 to m
    For i from 1 to n
      arr[i][j] = arr[i - 1][j] + arr[i][j - 1]
  return arr[m - 1][n - 1]
```
