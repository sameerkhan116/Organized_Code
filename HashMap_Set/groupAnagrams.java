import java.util.*;
/*
  Time complexity: 
*/

class groupAnagrams {
  public static List<List<String>> group(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String x : strs) {
      char[] a = x.toCharArray();
      Arrays.sort(a);
      if(map.containsKey(String.valueOf(a))) map.get(String.valueOf(a)).add(x);
      else {
        List<String> res = new ArrayList<>();
        res.add(x);
        map.put(String.valueOf(a), res);
      }
    }
    List<List<String>> res = new ArrayList<>();
    for(List<String> x : map.values()) {
      res.add(x);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(group(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
  }
}