/* 
  Time complexity: O(√n) where n is the number

  Explanation:
  ------------
  1. If n < 2 return false
  2. Othewise loop from from to square root of n
    • if n % i == 0 return false
  3. return true
*/

class isPrime {
  public static boolean prime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(prime(19));
    System.out.println(prime(3));
    System.out.println(prime(10));
  }
}