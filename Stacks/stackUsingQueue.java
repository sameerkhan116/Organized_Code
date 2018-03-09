import java.util.*;

class stackUsingQueue {
  Queue<Integer> q = new LinkedList<>();

  void push(int val) {
    int size = q.size();
    q.add(val);
    for (int i = 0; i < size; i++) {
      int x = q.remove();
      q.add(x);
    }
  }

  int pop() {
    if (q.isEmpty())
      return -1;
    int x = q.poll();
    return x;
  }

  int top() {
    if (!q.isEmpty())
      return q.peek();
    return -1;
  }

  boolean isEmpty() {
    return q.isEmpty();
  }
}