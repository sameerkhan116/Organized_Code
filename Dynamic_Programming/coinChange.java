import java.util.Arrays;

/* 
  Time Complexity: O(mn) where n is the sum and m is the size of the array
  Space Complexity: O(n)

  Explanation:
  ------------
  1. Create the table same size as sum to store the values of how many ways to get there.
  2. Set table[0] = 1
  3. Loop for each coin in coins
    Loop from each coin to sum
      table[j] += table[j - coin]
  4. return table sum
*/
class coinChange {
  public static int coins(int[] coins, int n) {
    int[] table = new int[n + 1];
    table[0] = 1;

    for (int coin : coins) {
      for (int j = coin; j <= n; j++) {
        table[j] += table[j - coin];
        System.out.println(Arrays.toString(table));
      }
    }
    return table[n];
  }

  public static void main(String[] args) {
    System.out.println(coins(new int[] { 1, 2, 3 }, 4));
  }
}