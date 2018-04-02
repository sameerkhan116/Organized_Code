public static class Stack {

  public static class Node {
    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  private Node top; // only need top for add and remove

  public boolean isEmpty() {
    return top == null;
  }

  public int peek() {
    return top.data;
  }

  /* 
    To push data in the Stack, we create the node.
    The node.next will be current top and then top = node.
  */
  public void push(int data) {
    Node node = new Node(data);
    node.next = top;
    top = node;
  }

  public int pop() {
    int data = top.data;
    top = top.next;
    return data;
  }
}