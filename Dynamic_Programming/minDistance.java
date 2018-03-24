/*
  Time Complexity: O(n)
*/

class minDistance {
  public static int min(int[] arr, int a, int b) {
    int min1 = -1, min2 = -1, min = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == a) min1 = i;
      if(arr[i] == b) min2 = i;
      if(min1 != -1 && min2 != -1) {
        int dist = Math.abs(min1 - min2);
        if(min == 0 || dist < min) min = dist;  
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(min(new int[]{1,2,3,1,4}, 1, 3));
  }
}