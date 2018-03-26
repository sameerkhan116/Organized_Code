/* 
  Time Complexity: O(n)
*/

class minStepsToReachEnd {
  public static int min(int[] arr) {
    int l = arr.length;
    if (l <= 0)
      return 0;
    // not possible to jump
    if (arr[0] == 0)
      return -1;

    int maxReach = arr[0], step = arr[0], jump = 1;

    for (int i = 1; i < l; i++) {
      // check if we have reached the end of the array
      if (i == l - 1)
        return jump;

      maxReach = Math.max(maxReach, i + arr[i]);
      step--;
      if (step == 0) {
        jump++;
        if (i >= maxReach)
          return -1;
        step = maxReach - i;
      }
      // System.out.println(i + " MaxReach: " + maxReach + ", Step: " + step + ", Jump: " + jump);
    }
    return -1;
  }

  public static int steps(int[] arr) {
    int l = arr.length;
    if (l <= 0)
      return 0;
    int maxReach = arr[0], step = arr[0], jump = 1;
    if (arr[0] == 0)
      return -1;

    for (int i = 1; i < l; i++) {
      if (i == l - 1)
        return jump;

      maxReach = Math.max(maxReach, i + arr[i]);
      step--;

      if (step == 0) {
        jump++;
        if (i >= maxReach)
          return -1;
        step = maxReach - i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(steps(new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }));
  }
}