import java.util.*;

class maxSpan {
  public static int maxSpan(int[] nums) {
    if (nums.length == 0 || nums == null)
      return 0;
    int max = 0;
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      List<Integer> x = map.getOrDefault(nums[i], new ArrayList<>());
      x.add(i);
      map.put(nums[i], x);
    }

    for (int x : map.keySet()) {
      List<Integer> b = map.get(x);
      if (b.size() > 1)
        max = Math.max(max, b.get(b.size() - 1) - b.get(0));
    }
    return max + 1;
  }

  public static void main(String[] args) {
    System.out.println(maxSpan(new int[] { 1, 2, 1, 1, 3 }));
    System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
    System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
  }
}