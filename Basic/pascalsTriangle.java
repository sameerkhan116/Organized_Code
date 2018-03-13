import java.util.*;

/*
  Time complexity: O(n*m) n -> number, m -> row size
*/

class pascalsTriangle {
  public static List<List<Integer>> pascals(int n) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      row.add(0, 1);
      for (int j = 1; j < row.size() - 1; j++) {
        row.set(j, row.get(j) + row.get(j + 1));
      }
      res.add(new ArrayList<>(row));
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(pascals(5));
  }
}