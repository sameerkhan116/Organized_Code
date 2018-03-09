
/*
  Time complxity: O(n^2)
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