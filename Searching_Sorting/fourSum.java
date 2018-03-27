
/*
  Time complxity: O(n^2)

  Explanation:
  ------------
  1. Go over the given four arrays 2 at time.
  2. Put the corresponding values in a map, along with a count of how many times that value occurs.
  3. Loop over the remaining two arrays and set sum = -(C[i] + D[j])
  4. Check the map if it contains that sum value, if it does, add the value from map to count
  5. return count
*/

import java.util.HashMap;
import java.util.Map;

class fourSum {
  public static int sum(int[] A, int[] B, int[] C, int[] D) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B.length; j++) {
        int sum = A[i] + B[j];
        map.put(sum, map.getOrDefault(sum, 0) + 1);
      }
    }

    for (int i = 0; i < C.length; i++) {
      for (int j = 0; j < D.length; j++) {
        int sum = -(C[i] + D[j]);
        if (map.containsKey(sum))
          count += map.get(sum);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2 }, new int[] { -2, -1 }, new int[] { -1, 2 }, new int[] { 0, 2 }));
  }
}