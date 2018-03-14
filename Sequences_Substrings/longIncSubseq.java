/*
  Time Complexity: O(n log(n))
*/

class longIncSubseq {
  public static int longest(int[] arr) {
    int[] tails = new int[arr.length];
    int size = 0;
    for (int x : arr) {
      int i = 0, j = size;
      while (i != j) {
        int m = i + (j - i) / 2;
        if (tails[m] < x)
          i = m + 1;
        else
          j = m;
      }
      tails[i] = x;
      if (i == size)
        ++size;
    }
    return size;
  }

  public static void main(String[] args) {
    System.out.println(longest(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
  }
}