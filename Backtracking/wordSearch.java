/*
  Time complexity: O(m*n*4^k) where m is number of rows, n is number of columns, k is length of string
*/

class wordSearch {
  public static boolean word(char[][] board, String word) {
    if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0)
      return false;
    int m = board.length, n = board[0].length;
    char[] w = word.toCharArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (helper(board, i, j, w, 0))
          return true;
      }
    }
    return false;
  }

  public static boolean helper(char[][] board, int i, int j, char[] word, int pos) {
    if (pos == word.length)
      return true;
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word[pos])
      return false;
    char temp = board[i][j];
    board[i][j] = '#';
    boolean res = helper(board, i + 1, j, word, pos + 1) || helper(board, i, j + 1, word, pos + 1)
        || helper(board, i, j - 1, word, pos + 1) || helper(board, i - 1, j, word, pos + 1);
    board[i][j] = temp;
    return res;
  }

  public static void main(String[] args) {
    System.out.println(
        word(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCCED"));
    System.out
        .println(word(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "SEE"));
    System.out
        .println(word(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCB"));
  }
}