import java.util.*;

/*
  Time complexity: O(n)
*/

class anagrams {
  public static boolean isAna(String a, String b) {
    String x = a.replace(" ", "").toLowerCase();
    String y = b.replace(" ", "").toLowerCase();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < x.length(); i++) {
      map.put(x.charAt(i), map.getOrDefault(x.charAt(i), 0) + 1);
    }
    for (int i = 0; i < y.length(); i++) {
      if (map.containsKey(y.charAt(i)))
        map.put(y.charAt(i), map.get(y.charAt(i)) - 1);
      else
        return false;
    }

    for (int i : map.values()) {
      if (i != 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isAna("Tom Marvolo Riddle", "I am Lord Voldemort"));
  }
}