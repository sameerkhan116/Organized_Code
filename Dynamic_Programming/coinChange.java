import java.util.Arrays;

/* 
  Time Complexity: O(mn)
  Space Complexity: O(n)
*/
class coinChange {
  public static int coins(int[] coins, int n) {
    int[] table = new int[n + 1];
    int m = coins.length;

    table[0] = 1;

    for (int i = 0; i < m; i++) {
      for (int j = coins[i]; j <= n; j++) {
        table[j] += table[j - coins[i]];
        System.out.println(Arrays.toString(table));
      }
    }
    return table[n];
  }

  public static void main(String[] args) {
    System.out.println(coins(new int[] { 1, 2, 3 }, 4));
  }
}