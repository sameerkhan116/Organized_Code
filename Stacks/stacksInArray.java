/*
  Time complexity for insertion and deletion: O(1)
*/

class stacksInArray {
  int size;
  int top1, top2;
  int arr[];

  // Constructor
  stacksInArray(int n) {
    arr = new int[n];
    size = n;
    top1 = -1;
    top2 = n;
  }

  void push1(int x) {
    if (top1 < top2 - 1) {
      top1++;
      arr[top1] = x;
    } else {
      throw new Exception("Stack Overflow");
    }
  }

  void push2(int x) {
    if (top1 < top2 - 1) {
      top2--;
      arr[top2] = x;
    } else {
      throw new Exception("Stack Overflow");
    }
  }

  int pop1(int x) {
    if (top1 >= 0) {
      int x = arr[top1];
      top1--;
      return x;
    } else
      throw new Error("Stack Underflow");
  }

  int pop2(int x) {
    if (top2 < size) {
      int x = arr[top2];
      top2++;
      return x;
    } else {
      throw new Exception("Stack Underflow");
    }
  }
}