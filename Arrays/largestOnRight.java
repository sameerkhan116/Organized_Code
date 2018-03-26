import java.util.*;

/*
  Time Complexity: O(n)

  Explanation:
  ------------
  1. Create a new arr of same size as given arr
  2. Set last element of new arr to -1 since no larger element on right
  3. Set temp as last element of given arr
  4. Loop from second last element to 0
    • set arr[index] = temp
    • if(arr[index] > temp) temp = arr[index]
  5. return arr
*/

class largestOnRight {
  public static int[] large(int[] nums) {
    int[] arr = new int[nums.length];
    int n = nums.length - 1, temp = nums[n];
    arr[n] = -1;
    for(int i = n - 1; i >= 0; i--) {
      arr[i] = temp;
      if(nums[i] > temp) temp = nums[i];
    }
    return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(large(new int[] { 16, 17, 4, 3, 5, 2 })));
  }
}