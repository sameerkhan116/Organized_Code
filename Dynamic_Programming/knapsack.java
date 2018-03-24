class knapsack {
  
  public static int KS(int W, int[] wt, int[] val, int n) {
    if (n == 0 || W == 0)
      return 0;
    else if(wt[n - 1] > W) return KS(W, wt, val, n -1);
    else return Math.max(val[n - 1] + KS(W - wt[n - 1], wt, val, n - 1), KS(W, wt, val, n - 1));
  }

  public static void main(String[] args) {
    int n = 5, W = 10;
    System.out.println(KS(W, new int[] { 1, 2, 4, 2, 5 }, new int[] { 5, 3, 5, 3, 2 }, n));
    System.out.println(KS(50, new int[] { 10, 20, 30 }, new int[] { 60, 100, 120 }, 3));
  }
}