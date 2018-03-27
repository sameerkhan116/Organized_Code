/* 
  Time complexity: O(k) where k is the number of accepted permutations
  
  Explanation:
  ------------
  1. Check every possible number in every possible location that satisifies the given relation.
  2. If it does, increment count, mark that number used and increment pos.
*/

class beautifulArrange {
  static int count = 0;

  public static int arrange(int N) {
    if (N == 0)
      return 0;
    helper(N, 1, new int[N + 1]);
    return count;
  }

  public static void helper(int N, int pos, int[] used) {
    if (pos > N) {
      count++;
      return;
    }

    for (int i = 1; i <= N; i++) {
      if (used[i] == 0 && i % pos == 0 || pos % i == 0) {
        used[i] = 1;
        helper(N, pos + 1, used);
        used[i] = 0;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(arrange(2));
    System.out.println(arrange(5));
  }
}