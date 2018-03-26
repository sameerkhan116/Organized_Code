import java.util.Arrays;

/* 
  Time complexity: O(n^2)
*/

class maxSumIncSubseq {
  public static int max(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;
    int n = nums.length;
    int[] table = new int[n];
    table[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j] && table[i] < table[j] + nums[i]) {
          table[i] = table[j] + nums[i];
        }
      }
    }
    return table[n - 1];
  }

  public static void main(String[] args) {
    System.out.println(max(new int[] { 1, 101, 2, 3, 100, 4, 5 }));
  }
}