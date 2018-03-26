import java.util.*;

/*
  Time complexity: O(n)
  Space Complexity: O(n)

  Explanation:
  ------------
  1. Loop over all elements of the first list and add them to a map.
  2. Loop over all elements of the second list and if map contains that element, add it to list.
  (may need to check for duplicates)
*/

class intersectionArray {
  public static List<Integer> intersect(int[] arr1, int[] arr2) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
      map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    }
    for (int i = 0; i < arr2.length; i++) {
      if (map.containsKey(arr2[i]))
        list.add(arr2[i]);
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
  }
}