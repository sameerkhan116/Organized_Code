# HashMap

HashMap contains a bunch of keys and values. If we want to keep the keys in a sorted order, we can use TreeMap.

### Algo for grouping anagrams

```pseudocode
  Loop over the given values
  For each string in given array of string, sort chars by converting to char array
  Add this sorted value to map
  Loop over rest of array and check if any other string match that key in map,
  otherwise add the key to the map
  Return List of map.values()
```
