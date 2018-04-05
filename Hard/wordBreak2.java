
/* 
  Time complexity: O(n^2) due to memoization.

  Explanation:
  ------------
  1. Create map to store string and list of strings that are possible outcomes for that string.
  2. If map contains that string, return map.get(s)
  3. If s is an empty string, return empty List.
  4. Go over words in dictionary. if the given string starts with the word, pass the substring 
     from this words length to the recursive function
*/

import java.util.*;

class wordBreak2 {
  public static List<String> wordBreak(String s, List<String> wordDict) {
    return DFS(s, wordDict, new HashMap<String, List<String>>());
  }

  public static List<String> DFS(String s, List<String> wordDict, HashMap<String, List<String>> map) {
    if (map.containsKey(s))
      return map.get(s);

    List<String> res = new ArrayList<>();
    if (s.length() == 0) {
      res.add("");
      return res;
    }
    for (String word : wordDict) {
      if (s.startsWith(word)) {
        List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
        for (String sub : sublist) {
          res.add(word + (sub.isEmpty() ? "" : " ") + sub);
        }
      }
    }
    map.put(s, res);
    return res;
  }

  public static void main(String[] args) {
    List<String> res = new ArrayList<>();
    res.add("cat");
    res.add("cats");
    res.add("and");
    res.add("sand");
    res.add("dog");
    System.out.println(wordBreak("catsanddog", res));
  }
}