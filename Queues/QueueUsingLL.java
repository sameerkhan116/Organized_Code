/*
  Time complexity: O(1) -> Enqueue, O(1) -> Dequeue
*/

class QueueUsingLL {

  // A custom class for a queue node
  class QNode {
    int key;
    QNode next;

    // Qnode key constructor specifies the value and points to the next
    public QNode(int key) {
      this.key = key;
      this.next = null;
    }
  }

  // front represents first node, rear represents last node
  QNode front, rear;

  public QueueUsingLL() {
    this.front = this.rear = null;
  }

  // To add queue node to linked list
  void enqueue(int key) {
    // init new qnode with the specified key
    QNode temp = new QNode(key);
    // If queue is empty then first node is first and rear both
    if (this.rear == null) {
      this.front = this.rear = temp;
      return;
    }
    // otherwise add new node at the end of the queue and change rear
    this.rear.next = temp;
    this.rear = temp;
  }

  // Method to dequeue
  QNode dequeue() {
    // if queue is empty, return null
    if (this.front == null)
      return null;
    // otherwise, store previus front and move front to next
    QNode temp = this.front;
    this.front = this.front.next;
    // if front becomes null, then change rear also to null
    if (this.front == null)
      this.rear = null;
    return temp;
  }
}