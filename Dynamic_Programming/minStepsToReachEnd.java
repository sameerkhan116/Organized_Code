/* 
  Time Complexity: O(n)
*/

class minStepsToReachEnd {
  public static int min(int[] arr) {
    int n = arr.length;
    int[] jump = new int[n];
    for (int i = 1; i < n; i++) {
      jump[i] = Integer.MAX_VALUE - 1;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[j] + j >= i) {
          jump[i] = Math.min(jump[i], jump[j] + 1);
        }
      }
    }
    return jump[n - 1];
  }

  public static void main(String[] args) {
    System.out.println(min(new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }));
  }
}