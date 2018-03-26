import java.util.*;

/* 
  Time complexity: O(n) where n is difference between the two given numbers

  Explanation:
  ------------
  1. Loop from low to high give number
    • For each number, get count of ones
    • if count of 1s is prime: res++
  2. return res
*/
class countsetBits {
  public static int count(int L, int R) {
    int count = 0;
    List<Integer> primes = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
    for (int i = L; i <= R; i++) {
      int oneCount = 0;
      for (int j = 0; j < 32; j++) {
        oneCount += i >> j & 1;
      }
      if (primes.contains(oneCount))
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(count(10, 15));
  }
}