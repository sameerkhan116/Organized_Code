import java.util.Arrays;

/*
  Time Complexity: O(n)
  Space Complexity: O(n)
*/

class longestSpan {
  // function to calculate the max length of the equal span in two binary arrays
  public static int span(int[] nums1, int[] nums2) {
    int n = nums1.length, maxLen = 0;
    // variables to store current sum of nums1 and nums2
    int preSum1 = 0, preSum2 = 0;
    // Create an array to store all possible difference values and initialize values to -1
    int[] diff = new int[2*n + 1];
    Arrays.fill(diff, -1);

    for(int i = 0; i < n; i++) {
      // add current variable of both arrays to presum1 and presum2
      preSum1 += nums1[i];
      preSum2 += nums2[i];
      // curr diff is the difference between the two spans
      int curr_diff = preSum1 - preSum2;
      int diffIndex = n + curr_diff;
      // if current difference is 0 that means there are same number of 1's in the array so i + 1 is the max length
      if(curr_diff == 0) maxLen = i + 1;
      // if current diff is seen for the first time, add it to the array of diff
      else if(diff[diffIndex] == -1) diff[diffIndex] = i;
      // otherwise, if this diff is already seen, find the length of this same sum common span and update maxlen
      else {
        int len = i - diff[diffIndex];
        if(len > maxLen) maxLen = len;
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
    int[] arr2 = {1, 1, 1, 1, 1, 0, 1};    
    System.out.println(span(arr1, arr2));
  }
}