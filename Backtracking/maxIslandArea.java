class maxIslandArea {
  public static int maxArea(int[][] island) {
    int max = 0;
    for (int i = 0; i < island.length; i++) {
      for (int j = 0; j < island[0].length; j++) {
        if (island[i][j] == 1)
          max = Math.max(max, helper(island, i, j));
      }
    }
    return max;
  }

  public static int helper(int[][] island, int i, int j) {
    if (i < 0 || j < 0 || i >= island.length || j >= island[0].length || island[i][j] != 1)
      return 0;
    island[i][j] = 0;
    return 1 + helper(island, i + 1, j) + helper(island, i - 1, j) + helper(island, i, j + 1)
        + helper(island, i, j - 1);
  }

  public static void main(String[] args) {
    System.out.println(
        maxArea(new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
            { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
            { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } }));
  }
}