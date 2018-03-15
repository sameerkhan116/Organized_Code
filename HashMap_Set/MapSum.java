import java.util.*;

class MapSum {
  Map<String, Integer> map;

  public MapSum() {
    map = new HashMap<>();
  }

  public void insert(String key, int val) {
    map.put(key, val);
  }

  public int sum(String prefix) {
    int sumOfAll = 0;
    for (String str : map.keySet()) {
      if (str.startsWith(prefix))
        sumOfAll += map.get(str);
    }
    return sumOfAll;
  }

  public static void main(String[] args) {
    MapSum x = new MapSum();
    x.insert("apple", 3);
    x.insert("app", 2);
    System.out.println(x.sum("ap"));
  }
}