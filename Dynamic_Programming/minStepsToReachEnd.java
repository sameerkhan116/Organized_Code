/* 
  Time Complexity: O(n^2)
*/

class minStepsToReachEnd {
  public static int minJumps(int[] arr) {
    int[] dp = new int[arr.length];
    for (int i = 1; i < arr.length; i++) {
      dp[i] = Integer.MAX_VALUE - 1;
    }
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[j] + j >= i)
          dp[i] = Math.min(dp[i], dp[j] + 1);
      }
    }
    return dp[arr.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(minJumps(new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }));
  }
}