import java.util.Arrays;

public class MinHeap {
  private int capacity = 10;
  private int size = 0;

  int[] items = new int[capacity];

  /* 
    Methods to get left, right and parent index
  */
  private int getLeftChildIndex(int parentIndex) {
    return 2 * parentIndex + 1;
  }

  private int getRightChildIndex(int parentIndex) {
    return 2 * parentIndex + 2;
  }

  private int getParentIndex(int childIndex) {
    return (childIndex - 1) / 2;
  }

  /* 
    Methods to check if the node has left/right child or parent
  */
  private boolean hasLeftChild(int index) {
    return getLeftChildIndex(index) < size;
  }

  private boolean hasRightChild(int index) {
    return getRightChildIndex(index) < size;

  }

  private boolean hasParent(int index) {
    return getParentIndex(index) >= 0;
  }

  /* 
    Methods to get value for left/right child and parent from items array
  */
  private int leftChild(int index) {
    return items[getLeftChildIndex(index)];
  }

  private int rightChild(int index) {
    return items[getRightChildIndex(index)];
  }

  private int parent(int index) {
    return items[getParentIndex(index)];
  }

  /* 
    Simple swap method needed for heapify
  */
  private void swap(int indexOne, int indexTwo) {
    int temp = items[indexOne];
    items[indexOne] = items[indexTwo];
    items[indexTwo] = temp;
  }

  /* 
    Check if array has capacity, otherwise, create a new array double in size
  */
  private void ensureExtraCapacity() {
    if (size == capacity) {
      items = Arrays.copyOf(items, capacity * 2);
      capacity *= 2;
    }
  }

  /* 
    Simple peek, return first element in the array
  */
  public int peek() {
    if (size == 0)
      throw new IllegalStateException();
    return items[0];
  }

  /* 
    Poll method: remove first element
    Remove first element and move the absolute last element to head.
    Also, decrease the size by 1 and then heapify down to move the element 
    added to head to its rightful place.
  */
  public int poll() {
    if (size == 0)
      throw new IllegalStateException();
    int item = items[0];
    items[0] = items[size - 1];
    size--;
    heapifyDown();
    return item;
  }

  /* 
    Simple add method, add the new element to the end of the array, after
    making sure there is space available. increment the size after insertion.
    Finally heapifyUp to make sure that the newly inserted element is in the right place.
  */
  public void add(int item) {
    ensureExtraCapacity();
    items[size] = item;
    size++;
    heapifyUp();
  }

  /* 
    To heapify up, we set index to last element we inserted.
    Then we loop while the current index child has parent and the value of the parent > value at this index.
    if this is the case, we swap the parent index and the current index.
  */
  public void heapifyUp() {
    int index = size - 1;
    while (hasParent(index) && parent(index) > items[index]) {
      swap(getParentIndex(index), index);
      index = getParentIndex(index);
    }
  }

  /* 
    To heapify up, we start from the root element and move from left to right. While the left child is
    present, smallerChildIndex = getLeftChildIndex. next, we check if a right child is also present.
    if right child index < leftChild(index) then rightChild will be the smaller child.
    If(current index < smallerchildindex) just break, otherwise, swap index, smallerchildindex
    finally, set index to smaller child index
  */
  public void heapifyDown() {
    int index = 0;
    while (hasLeftChild(index)) {
      int smallerChildIndex = getLeftChildIndex(index);
      if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
        smallerChildIndex = getRightChildIndex(index);
      }

      if (items[index] < items[smallerChildIndex])
        break;
      else
        swap(index, smallerChildIndex);

      index = smallerChildIndex;
    }
  }
}