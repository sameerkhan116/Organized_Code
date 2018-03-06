/*
  Time Complexity: O(n^2)
*/

class maxLenContSub {
  public static int maxSub(int[] nums) {
    int maxlen = 1, n = nums.length;
    for(int i = 0; i < n - 1; i ++) {
      int min = nums[i], max = nums[i];
      for(int j = i + 1; j < n; j++) {
        min = Math.min(min, nums[j]);
        max = Math.max(max, nums[j]);
        if(max - min == j - i) maxlen = Math.max(maxlen, max - min + 1);
      }
    }
    return maxlen;
  }

  public static void main(String[] args) {
    System.out.println(maxSub(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45}));
  }
}