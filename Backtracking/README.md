# Backtracking

Backtracking is an algorithmic paradigm that tries all solution until it finds one that works. Unlike naive solution where all possible combinations are tried, backtracking works in an incremental way. We start with an empty set of items. When we add an item to the set, we check if it violates the current problem constraint. If it does then we remove the item and try other alternatives. If none of the items work then we go to the previous state and remove all the items added in this state. If we reach the initial state, we can say that no solution exists.

### Algo for Knight's tour
```
If all squares are visited
  print the solution
Else 
  a. Add the solution to the visited set and recursively check if the move leads to a solution (A knight can make 8 moves and we can choose from one of the 8 moves in this step).
  b. If the move chosen above doesn't lead to a solution, we can remove this move from the set and try other alternatives.
  c. If none of the alternatives work then we return false
```

### Algo for n-Queen Problem
```
1. Start in the leftmost corner
2. If all queens are placed
    return true
3. Try all rows in the current column, then for each row:
    a. If all queens can be placed safely in this row then mark this [row,col] as part of the solution and recursively check if placing a queen here leads to a solution.
    b. If placing a queen in [row,col] leads to a solution, return true.
    c. If placing a queen doesn't lead to a solution then unmark this [row,col]. Backtrack and go to step (a) to try other rows.
4. If all rows have been tried and nothing worked, return false
```

### Algo for Rat in a maze problem
```
  If destination is reached
    print the solution matrix
  Else
    a. Mark the current cell in the solution matrix as 1
    b. Move forward in the horizontal direction and recursively check if it leads to a solution
    c. If the above move doesn't lead to a solution, then move vertically and recurively check for solution.
    d. If none of the moves work, return false
```