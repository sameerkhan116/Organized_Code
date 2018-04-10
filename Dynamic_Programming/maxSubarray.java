import java.util.*;

class maxSubarray {
  public static int max(int[] arr) {
    for(int i = 1; i < arr.length; i++) {
      arr[i] = Math.max(arr[i - 1] + arr[i], Math.max(arr[i - 1], arr[i]));
    }
    return arr[arr.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(max(new int[]{-1,2,3,5,1,10,11,-8}));
  }
}
