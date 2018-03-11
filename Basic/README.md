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

### Algo to check if two strings are anagrams

```pseudocode
  For both given strings, replace uppercase letters, spaces etc.
  Use a map to keep count of each character.
  Loop over first string and map each character occurence in hashmap.
  Loop over second string and if:
    map contains current char then substract the value of that character in the map
    else return false
  Loop over the map.values()
  if one of them is not 0, return false
  Otherwise return true
```

### Algo to merge overlapping intervals

```pseudocode
  Create a new list to store the result
  List of intervals can be sorted as:
    list.sort((i1, i2) -> Integers.compare(i1.start, i2.start))
  Set start = intervals.get(0).start, end = intervals.get(0).end
  Loop over all intervals
    If(i.start >= end)
      end = i.start
    Else
      start = i.start, end = i.end
  res.add(new interval(start, end))
  return res
```

### Algo for ways to climb stairs with 1 or 2 step

```pseudocode
  If n <= 2
    Return 2
  Otherwise set allway = 0, oneway = 2, twoway = 1
  Loop from 2 to number of stairs
    allway is oneway + twoway
    twoway = oneway
    oneway = allway
  Return allway
```

### Algo for sorting by colors 0,1,2

```pseudocode
  lo = 0, hi = arr.length - 1
  loop over array from lo to high
    If(arr[i] == 0)
      swap arr[lo] and arr[i]
      i++; lo++;
    Else
      swap arr[hi] and arr[i]
      high--
    Else i++
  Return arr
```
