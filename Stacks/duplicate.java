import java.util.*;

class duplicate {
  public static int dup(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (!set.add(n))
        return n;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(dup(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }));
  }
}