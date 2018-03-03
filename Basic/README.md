# Basic Algorithm Questions

### Algo for reversing a string

```pseudocode
  Set i = 0 and j = length of string - 1
  Convert string to char array
  While i <= j
    swap i and j
    increment i and decrement j
  return string value of array
```

### Algo to find the single number in array where every other number appears twice

```pseudocode
  Set current number to first number in array
  Loop over rest of the array
    curr = curr XOR current number in array
  Return curr
```

### Algo for adding two numbers without addition operator

```pseudocode
  While b is not 0
    Set carry as a & b
    a = a XOR b
    b = carry << 1
  return a
```  