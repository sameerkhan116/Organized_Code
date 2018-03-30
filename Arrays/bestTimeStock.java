import java.util.Arrays;

class bestTimeStock {
  public static int best(int[] nums) {
    int n = nums.length - 1, max = 0;
    int[] res = new int[n + 1];
    res[n] = -1;
    int temp = nums[n];
    for (int i = n; i >= 0; i--) {
      if (temp < nums[i])
        temp = nums[i];
      res[i] = temp - nums[i];
      System.out.println(temp);
    }

    for (int i = 0; i < res.length; i++) {
      if (res[i] > max)
        max = res[i];
    }
    System.out.println(Arrays.toString(res));
    return max <= 0 ? 0 : max;
  }

  public static void main(String[] args) {
    System.out.println(best(new int[] { 7, 1, 5, 3, 6, 4 }));
  }
}