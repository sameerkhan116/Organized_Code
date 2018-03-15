import java.util.*;

class duplicateFileInSystem {
  public static List<List<String>> duplicate(String[] paths) {
    List<List<String>> res = new ArrayList<>();
    Map<String, Set<String>> map = new HashMap<>();

    if (paths == null || paths.length == 0)
      return res;
    for (String path : paths) {
      String[] strs = path.split("\\s+");

      for (int i = 1; i < strs.length; i++) {
        int idx = strs[i].indexOf("(");
        String content = strs[i].substring(idx);
        String filename = strs[0] + "/" + strs[i].substring(0, idx);
        System.out.println(filename);

        Set<String> filenames = map.getOrDefault(content, new HashSet<>());
        filenames.add(filename);
        map.put(content, filenames);
      }

    }
    // System.out.println(map.values());

    for (String x : map.keySet()) {
      if (map.get(x).size() > 1) {
        res.add(new ArrayList<String>(map.get(x)));
      }
    }

    return res;

  }

  public static void main(String[] args) {
    System.out.println(duplicate(new String[] { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
        "root/c/d 4.txt(efgh)", "root 4.txt(efgh)" }));
  }
}