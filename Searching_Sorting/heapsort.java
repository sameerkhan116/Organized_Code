import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
  Time complexity: O(nlog(n))
  Space complexity: O(1)
*/
class heapsort {
  public static void sort(int[] nums) {
    int n = nums.length;
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(nums, n, i);
    }

    for (int i = n - 1; i >= 0; i--) {
      int temp = nums[0];
      nums[0] = nums[i];
      nums[i] = temp;
      heapify(nums, i, 0);
    }
  }

  public static void heapify(int[] nums, int n, int i) {
    int largest = i, l = 2 * i + 1, r = 2 * i + 2;

    if (l < n && nums[l] > nums[largest])
      largest = l;
    if (r < n && nums[r] > nums[largest])
      largest = r;

    if (largest != i) {
      int temp = nums[i];
      nums[i] = nums[largest];
      nums[largest] = temp;
      heapify(nums, n, largest);
    }
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 2, 5, 2, 1, 6, 2, 4, 5 };
    sort(nums);
    System.out.println(Arrays.toString(nums));
  }
}