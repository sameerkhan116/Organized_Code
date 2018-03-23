# Backtracking

Backtracking is an algorithmic paradigm that tries all solution until it finds one that works. Unlike naive solution where all possible combinations are tried, backtracking works in an incremental way. We start with an empty set of items. When we add an item to the set, we check if it violates the current problem constraint. If it does then we remove the item and try other alternatives. If none of the items work then we go to the previous state and remove all the items added in this state. If we reach the initial state, we can say that no solution exists.

### Algo for Knight's tour

```pseudocode
If all squares are visited
  print the solution
Else
  a. Add the solution to the visited set and recursively check if the move leads to a solution (A knight can make 8 moves and we can choose from one of the 8 moves in this step).
  b. If the move chosen above doesn't lead to a solution, we can remove this move from the set and try other alternatives.
  c. If none of the alternatives work then we return false
```

### Algo for n-Queen Problem

```pseudocode
Start in the leftmost corner
If all queens are placed
  return true
Try all rows in the current column, then for each row:
  a. If all queens can be placed safely in this row then mark this [row,col] as part of the solution and recursively check if placing a queen here leads to a solution.
  b. If placing a queen in [row,col] leads to a solution, return true.
  c. If placing a queen doesn't lead to a solution then unmark this [row,col]. Backtrack and go to step (a) to try other rows.
If all rows have been tried and nothing worked, return false
```

### Algo for Rat in a maze problem

```pseudocode
  If destination is reached
    print the solution matrix
  Else
    a. Mark the current cell in the solution matrix as 1
    b. Move forward in the horizontal direction and recursively check if it leads to a solution
    c. If the above move doesn't lead to a solution, then move vertically and recursively check for solution.
    d. If none of the moves work, return false
```

### Algo for Permutation of a string

```pseudocode
  If current index is equal to last index of string
    print all permutations
  Else
    a. Loop from curr index to last index and swap characters at these indexes
    b. recursively call the function with this string and curr index + 1
    c. swap back to get the original index
```

### Algo for subset of a given integer array

```pseudocode
  Set start = 0
  Add current temp list to main list (first empty subset)
  Else
    a. Loop from start to length of array
    b. Add current (nums[i]) to temp list and recursively call from with start + 1
    c. Remove the last element from the temp list
```

### Algo for balanced parentheses

```pseudocode
  If current string size is equal to given number of parentheses * 2 then add the string to result list and return
  If open < number of parens
    Recurively call (result list, str + "(", open + 1, close, number of parens)
  If open < number of parens
    Recurively call (result list, str + ")", open, close + 1, number of parens)  
```

### Algo for beautiful arrangement

> Startingg from the last element in the array because larger elements are less likely to be divisible than smaller elements

```pseudocode
  Set a global variable count

  Init arr of size N + 1
  Loop over array and fill every element with its corresponding index
  Use helper function(arr, N) to fill up array
  return count

  In helper function
  if N == 0
    count++
    return

  for(int i = start; i >= 0; i--)
    swap(arr, i, start)
    if(arr[start] % start == 0 || start % arr[start] == 0) helper(arr, N - 1)
    swap(nums, start, i)
```

### Algo for letter case permutation

```pseudocode
  Check if the string is not null or length 0.
  Init a List to store all permutations of the string
  Use helper function to backtack(S, res, 0)
  return res

  Helper function
  if(s.length == pos)
    res.add(s)
    return;

  If(s.charAt(i) >= '0' && s.charAt(i) <= '9')
    helper(s, res, pos + 1)

  otherwise split string into char array
  Change current character to uppercase
  helper(String.valueOf(chars), res, pos + 1);
  Change current char to lower case
  helper(String.valueOf(chars), res, pos + 1);
```

### Algo for word search (for a single word)

```pseudocode
  Check if given board and word are valid
  Convert string to char array for each of accessing each char
  Loop over board from 0 to m
    Loop over board from 0 to n
      if(helper(board,i,j,w,0)) return true
  return false

  Helper function
  if(pos == word.length) return true;

  Check params - if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word[pos]) return false;
  board[i][j] ^= 256;
  boolean res = run exist for i + 1, i - 1, j + 1, j - 1
  board[i][j] ^= 256
  return res
```

### Algo for word search 2

```pseudocode

```
