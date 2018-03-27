/*
  Time complexity: O(n*log(n)*n)
  Further optimization: O(n*log(m))
  
  Explanation:
  ------------
  1. Get m = matrix.length - 1 and n = matrix[0].length - 1.
  2. lo = first element of matrix, hi = last element of matrix + 1
  3. While lo < hi:
    • mid = lo + (hi - lo) / 2
    • count = 0, j = n
    • Loop from i = 0 to m inclusive:
      º Find the count of smaller elements
      º while(j >= 0 && matrix[i][j]) j--;
      º count += j + 1
    • if(count < k) lo = mid + 1
    • else hi = mid
  4. Return lo
*/

class kthSmallestInSorted {
  public static int smallest(int[][] matrix, int k) {
    int m = matrix.length - 1, n = matrix[0].length - 1;
    int lo = matrix[0][0], hi = matrix[m][n] + 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = 0, j = n;
      for (int i = 0; i <= m; i++) {    
        while (j >= 0 && matrix[i][j] > mid)
          j--;
        count += j + 1;
      }
      if (count < k)
        lo = mid + 1;
      else
        hi = mid;
    }
    return lo;
  }

  public static int s(int[][] nums, int k) {
    int m = nums.length - 1, n = nums[0].length - 1;
    int lo = nums[0][0], hi = nums[m][n] + 1;
    while(lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = 0, j = n;
      for(int i = 0; i <= m; i++) {
        while(j >= 0 && nums[i][j] > mid) {
          j--;
        }
        count += j + 1;
      }
      if(count < k) lo = mid + 1;
      else hi = mid;
    }
    return lo;
  }

  public static void main(String[] args) {
    System.out.println(s(new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } }, 8));
  }
}