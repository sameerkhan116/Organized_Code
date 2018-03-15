import java.util.*;

class sortByFreq {
  public static String sort(String s) {

    PriorityQueue<Map.Entry<Character, Integer>> minHeap = new PriorityQueue<>(
        (i1, i2) -> i2.getValue() - i1.getValue());
    Map<Character, Integer> map = new HashMap<>();
    StringBuilder str = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    minHeap.addAll(map.entrySet());

    while (!minHeap.isEmpty()) {
      Map.Entry<Character, Integer> a = minHeap.poll();
      for (int i = 0; i < (int) a.getValue(); i++) {
        str.append(a.getKey());
      }
    }
    return str.toString();
  }

  public static void main(String[] args) {
    System.out.println(sort("tree"));
  }
}