import java.util.Arrays;

class longestIncSubseq {
  public static int max(int[] nums) {
    int max = 0, n = nums.length;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = 1;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j] && arr[i] < arr[j] + 1) {
          arr[i] = arr[j] + 1;
        }
      }
    }

    for (int x : arr) {
      if (x > max)
        max = x;
    }

    return max;
  }

  public static void main(String[] argss) {
    System.out.println(max(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 }));
  }
}