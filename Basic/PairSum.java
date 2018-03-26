
/*
  Time Complexity: O(n)

  Explanation:
  ------------
  O(log(n)) time without extra space - but array needs to be sorted
  1. Sort array and binary search.
  2. lo = 0, hi = n - 1
  3. while lo < hi:
    • if(arr[lo] + arr[hi] > sum) hi++;
    • else if(arr[lo] + arr[hi] < sum) lo--;
    • else if(arr[lo] + arr[hi] == sum) return true;
  4. return false;

  O(n) time -> O(n) space
  Create a set of seen integers and keep going until we find sum - nums[i] in seen: return true
  return false; 
*/

import java.util.*;

class PairSum {

  public static boolean pair(int[] nums, int sum) {
    long Start = System.nanoTime();
    int lo = 0, hi = nums.length - 1;
    while (lo <= hi) {
      if (nums[lo] + nums[hi] > sum)
        hi--;
      else if (nums[lo] + nums[hi] < sum)
        lo++;
      else if (nums[lo] + nums[hi] == sum)
        return true;
    }
    long End = System.nanoTime();
    System.out.println(End - Start);
    return false;
  }

  /*
  Works even for unsorted arrays but takes O(n) extra space. 
  */
  public static boolean pairO(int[] nums, int sum) {
    long Start = System.nanoTime();
    Set<Integer> res = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!res.contains(nums[i]))
        res.add(sum - nums[i]);
      else
        return true;
    }
    long End = System.nanoTime();
    System.out.println(End - Start);
    return false;
  }

  public static void main(String[] args) {
    System.out.println(pair(new int[] { 1, 2, 3, 9 }, 8));
    // System.out.println(pair(new int[] { 1, 2, 4, 4 }, 8));
    System.out.println(pairO(new int[] { 1, 2, 3, 9 }, 8));
    // System.out.println(pairO(new int[] { 4, 3, 1 }, 8));
  }
}