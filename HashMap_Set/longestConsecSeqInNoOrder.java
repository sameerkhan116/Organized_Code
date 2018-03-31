import java.util.*;

class longestConsecSeqInNoOrder {
  public static int longest(int[] nums) {
    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      int l = map.getOrDefault(n - 1, 0);
      int r = map.getOrDefault(n + 1, 0);
      int sum = l + r + 1;
      res = Math.max(res, sum);

      map.put(n - l, sum);
      map.put(n - r, sum);
      map.put(n, sum);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(longest(new int[] { 100, 4, 200, 1, 3, 2 }));
  }
}