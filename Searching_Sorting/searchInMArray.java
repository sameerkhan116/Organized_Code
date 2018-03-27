import java.util.Arrays;
/*
  Time complexity: O(m + n) for m x n matrix

  Explanation:
  ------------
  1. Set i = 0, j = arr.length - 1
  2. Loop while i < arr.length && j >= 0
    • if(nums[i][j] == 0) return i and j
    • if(nums[i][j] < n) i++
    • else j--
  3. return null
*/

class searchInMArray {
  public static int[] search(int[][] arr, int x) {
    int i = 0, j = arr.length - 1;
    while (i < arr.length && j >= 0) {
      if (arr[i][j] == x)
        return new int[] { i, j };
      else if (arr[i][j] > x)
        j--;
      else
        i++;
    }
    return null;
  }

  public static void main(String[] args) {
    int[][] arr = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
    System.out.println(Arrays.toString(search(arr, 29)));
  }
}