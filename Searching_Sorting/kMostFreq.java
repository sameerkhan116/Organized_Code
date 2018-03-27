import java.util.*;
import java.util.Map.Entry;
/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Create a list in which we will add the topKFreq, a map to map each of the values in the array and a priority queue to sort the hashmap.
  2. Map each value in the array to map
  3. Sort the map using priorityQueue
  4. While res.size() < k required, add map.entry from polling priority queue to it.
  5. Return res

*/

class kMostFreq {
  public static List<Integer> topKFreq(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
    List<Integer> res = new ArrayList<>();

    for (int n : nums)
      map.put(n, map.getOrDefault(n, 0) + 1);
    for (Map.Entry<Integer, Integer> entry : map.entrySet())
      maxHeap.add(entry);

    while (res.size() < k) {
      Map.Entry<Integer, Integer> x = maxHeap.poll();
      res.add(x.getKey());
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(topKFreq(new int[] { 1, 1, 1, 1, 2, 2, 2, 2, 1, 3, 4, 5, 1, 3, 2, 6 }, 2));
  }
}