# Queue Data Structure

Queue is a linear structure that follows a particular order in which operations are performed. The order is FIFO.
Insertion at one end, deletion at other end.

Enqueue, Dequeue, Front(), isEmpty()
Application of queue:

1.  When a resource is shared among multiple consumers.
2.  When data is transferred asynchronously.

### Algo for representing queue using LinkedList

```pseudocode
  Create a class to represent the QNode
    it has a value and a pointer to next
    QNode(int key)
      this.key = key
      this.next = null

  For the linked list rep, create a QNode for front and rear
  Set front and rear to null in constructor

  To enqueue, we pass a value and crate a temp QNode with this value.
  If front is null, then Queue is empty so this.front = this.rear = temp
  Else
    this.rear.next = temp
    this.rear = temp

  To dequeue,
    if front is null, then queue is empty so return null
    Else QNode temp = this.front
    this.front = this.front.next
    if(this.front == null) this.rear = null
    return temp
```
