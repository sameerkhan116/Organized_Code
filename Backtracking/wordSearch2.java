import java.util.*;

class wordSearch2 {

  class TrieNode {
    TrieNode[] next = new TrieNode[26];
    String word;
  }

  public TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();
    for (String word : words) {
      TrieNode p = root;
      for (char c : word.toCharArray()) {
        int i = c - 'a';
        if (p.next[i] == null)
          p.next[i] = new TrieNode();
        p = p.next[i];
      }
      p.word = word;
    }
    return root;
  }

  public List<String> word(char[][] board, String[] words) {
    List<String> res = new ArrayList<>();
    if (board == null || board.length == 0 || board[0].length == 0 || words == null || words.length == 0)
      return res;

    TrieNode root = buildTrie(words);
    int m = board.length, n = board[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        helper(board, i, j, root, res);
      }
    }

    return res;
  }

  public void helper(char[][] board, int i, int j, TrieNode p, List<String> res) {
    char c = board[i][j];
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || c == '#' || p.next[c - 'a'] == null)
      return;
    p = p.next[c - 'a'];

    if (p.word != null) {
      res.add(p.word);
      p.word = null;
    }

    board[i][j] = '#';
    helper(board, i - 1, j, p, res);
    helper(board, i + 1, j, p, res);
    helper(board, i, j + 1, p, res);
    helper(board, i, j - 1, p, res);
    board[i][j] = c;
  }

  public static void main(String[] args) {
    char[][] board = new char[][] { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
        { 'i', 'f', 'l', 'v' } };
    String[] words = new String[] { "oath", "pea", "eat", "rain" };
    wordSearch2 x = new wordSearch2();
    System.out.println(x.word(board, words));
  }
}