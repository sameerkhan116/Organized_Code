/* 
  A singly linked list will contain two props - The next node and the data current node contains
*/

public class Node {
  Node next;
  int data;

  public Node(int data) {
    this.data = data;
  }
}

public class LinkedList {
  Node head;

  /* 
    To append to a link list, we check if head is null, 
    if it is the current data will make the head node.
    Otherwise, start from head and move along link list while next
    element is not null. When we reach that element, we can add
    curren.next = new Node(data);
  */
  public void append(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }

  /* 
    Method to insert at head. Create newhead that will prepend have a
    pointer next to head. Finally, the head of the link list will be the newhead
  */
  public void prepend(int data) {
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  /* 
    If node to be deleted is head, just move pointer for head to next and return.
    Otherwise, move over linked list while next != null. if the data of the next node
    is what we want to delete, just skip pointer for next to next.next
  */
  public void deleteWithValue(int data) {
    if (head == null)
      return;
    if (head.data == data) {
      head = head.next;
      return;
    }

    Node current = head;
    while (current.next != null) {
      if (current.next.data == data) {
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }

}