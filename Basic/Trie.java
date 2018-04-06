import java.util.*;

class Trie {

  private class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfWord;

    public TrieNode() {
      children = new HashMap<>();
      endOfWord = false;
    }
  }

  private final TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
      TrieNode node = current.children.get(c);
      if (node == null) {
        node = new TrieNode();
        current.children.put(c, node);
      }
      current = node;
    }
    current.endOfWord = true;
  }

  public boolean search(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
      TrieNode node = current.children.get(c);
      if (node == null)
        return false;
      current = node;
    }
    return current.endOfWord;
  }

  public boolean delete(String word) {
    delete(root, word, 0);
  }

  private boolean delete(TrieNode current, String word, int index) {
    if (index == word.length()) {
      if (!current.endOfWord)
        return false;
      current.endOfWord = false;
      return current.children.size() == 0;
    }
    char c = word.charAt(index);
    TrieNode node = current.children.get(c);
    if (node == null)
      return false;
    boolean shouldDelCurrentNode = delete(node, word, index + 1);

    if (shouldDelCurrentNode) {
      current.children.remove(c);
      return current.children.size() == 0;
    }
    return false;
  }
}