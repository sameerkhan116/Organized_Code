import java.util.Arrays;

/* 
  Time complexity: O(mn) where m is the size of the array and n is sum
*/

class reachScore {
  public static int reach(int[] nums, int tot) {
    if (nums == null || nums.length == 0 || tot == 0)
      return 0;
    int[] table = new int[tot + 1];
    table[0] = 1;
    for (int i = 0; i < nums.length; i++) {
      for (int j = nums[i]; j <= tot; j++) {
        table[j] += table[j - nums[i]];
      }
    }
    System.out.println(Arrays.toString(table));
    return table[tot];
  }

  public static void main(String[] args) {
    System.out.println(reach(new int[] { 3, 5, 10 }, 13));
  }
}