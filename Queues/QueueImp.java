public static class Queue {

  /* 
    Class node to represent a Ndoe in the queue
    It has two variable data and a pointer to next node
  */
  private static class Node {
    private int data;
    private Node next;

    private Node(int data) {
      this.data = data;
    }
  }

  private Node head; // remove from head
  private Node tail; // add to tail

  public boolean isEmpty() {
    return head == null;
  }

  public int peek() {
    return head.data;
  }

  /* 
    To add to queue, put this node as tail.next and then update the LL tail with this node.
    If head is null, this node is now the head.
  */
  public void add(int data) {
    Node node = new Node(data);
    if (tail != null)
      tail.next = node;
    tail = node;
    if (head == null)
      head = node;
  }

  /* 
    To remove from queue, the data will be head.data. We move head to the next element.
    If in removign the head, the head becomes null, then tail is also null.
  */
  public int remove() {
    int data = head.data;
    head = head.next;
    if (head == null)
      tail = null;
    return data;
  }
}