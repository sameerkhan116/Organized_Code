/* 
  Time Complexity: O(n)
  Space complexity: O(1)

  Explanation:
  ------------
  1. We start by setting the left and right to each end of the array. l = 0, r = n - 1
  2. Also set l 
  3. Loop while l < r:
    • If(A[l] <= A[r]): if(A[l] >= maxL) maxL = A[l],  else res += maxL - A[l]
    • else: if(A[r] >= maxR) maxR = A[r],  else res += maxR - A[r]
  4. Return res
*/

class trappingRainWater {
  public static int trap(int[] A) {
    int n = A.length;
    int l = 0, r = n - 1, maxL = 0, maxR = 0;
    int res = 0;

    while (l < r) {
      if (A[l] <= A[r]) {
        if (A[l] >= maxL)
          maxL = A[l];
        else
          res += maxL - A[l];
        l++;
      } else {
        if (A[r] >= maxR)
          maxR = A[r];
        else
          res += maxR - A[r];
        r--;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(t(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
  }
}