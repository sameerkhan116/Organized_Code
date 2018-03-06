/*
  Time Complexity: O(n)
*/

import java.util.*;

class PairSum {

  public static boolean pair(int[] nums, int sum){
    int lo = 0, hi = nums.length - 1;
    while(lo <= hi) {
      if(nums[lo] + nums[hi] > sum) hi--;
      else if(nums[lo] + nums[hi] < sum) lo++;
      else if(nums[lo] + nums[hi] == sum) return true;
    }
    return false;
  }
  /*
    Works even for unsorted arrays but takes O(n) extra space. 
  */
  public static boolean pairO(int[] nums, int sum) {
    Set<Integer> res = new HashSet<>();
    for(int i = 0; i < nums.length; i++) {
      if(!res.contains(nums[i])) res.add(sum - nums[i]);
      else return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // System.out.println(pair(new int[]{1,2,3,9}, 8));
    // System.out.println(pair(new int[]{1,2,4,4}, 8));
    System.out.println(pairO(new int[]{3,2,1,4,5,7}, 8));
    System.out.println(pairO(new int[]{4,3,1}, 8));
  }
}