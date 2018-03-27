import java.util.*;

/*
  Time Complexity: O(n*m)

  Explanation:
  ------------
  Loop from i = 0 to 9
  1. Create a set for row, columns and cube
  2. Loop from j = 0 to 9
    if(board[i][j] != '.' && !row.add(board[i][j])) return false
    if(board[j][i] != '.' && !col.add(board[j][i])) return false
    rowindex = 3 * i /3 + j /3, colIndex = 3 * j/3 + j % 3
    if(cube[row][col] != '.' && !cube.add(board[row][col])) return false;
*/

class validSudoku {
  public static boolean isValid(char[][] board) {
    for (int i = 0; i < 9; i++) {
      Set<Character> rows = new HashSet<>();
      Set<Character> cols = new HashSet<>();
      Set<Character> cube = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !rows.add(board[i][j]))
          return false;
        if (board[j][i] != '.' && !cols.add(board[j][i]))
          return false;
        int rowindex = (3 * (i / 3)) + j / 3;
        int colsindex = (3 * (j % 3)) + j % 3;
        if (board[rowindex][colsindex] != '.' && !cube.add(board[rowindex][colsindex]))
          return false;
      }
    }
    return true;
  }
}