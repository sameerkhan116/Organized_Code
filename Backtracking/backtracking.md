# Backtracking

Backtracking is an algorithmic paradigm that tries all solution until it finds one that works. Unlike naive solution where all possible combinations are tried, backtracking works in an incremental way. We start with an empty set of items. When we add an item to the set, we check if it violates the current problem constraint. If it does then we remove the item and try other alternatives. If none of the items work then we go to the previous state and remove all the items added in this state. If we reach the initial state, we can say that no solution exists.

### Backtracking Algo for Knight's tour
```
If all squares are visited
  print the solution
Else 
  a. Add the solution to the visited set and recursively check if the move leads to a solution (A knight can make 8 moves and we can choose from one of the 8 moves in this step).
  b. If the move chosen above doesn't lead to a solution, we can remove this move from the set and try other alternatives.
  c. If none of the alternatives work then we return false
```