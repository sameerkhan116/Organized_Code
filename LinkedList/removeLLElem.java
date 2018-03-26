/* 
  Time Complexity: O(n)
*/

class removeLLElem {
  public ListNode remove(ListNode head, int val) {
    if (head == null)
      return head;
    head.next = remove(head.next, val);
    return head.val == val ? head.next : head;
  }
}