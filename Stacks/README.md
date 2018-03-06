# Stack Data Structure

Some basic operations - push, pop, isEmpty, peek, poll.
Access and search in stack takes O(n) whereas insertion and deletion can be done in O(1).

Stacks can be implemented using arrays and linked lists.

Applications of stack:

1.  For backtracking
2.  Infix to postfix / prefix conversion
3.  Redo/Undo features.
4.  Balancing of symbols.

### Algo for stock span problem

```pseudocode
  Create a stock and an array to store result
  Push index 0 to stack and set res[0] = 1
  Loop over given stocks array from 1 to end
    a) While stack is not empty and arr[st.peek()] <= arr[i]
      Pop element from stack
    b) If stack is empty then set res[i] to i + 1, otherwise i - st.peek()
    c) push current index (i) to stack
  Return results array
```

### Algo for longest valid substring

```pseudocode
  Create a stack and push -1.
  Loop over the string
    a) If character at curr index is '('
      Push the index to stack.
    b) Else
      Pop last element from array.
      If stack is not empty
        result = max(result, curr index - last element in stack)
    c) else push curr index to stack
  Return result
```
