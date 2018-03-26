/* 
  Time complexity: O(n)
*/

class oddEvenLL {
  public ListNode oddEven(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode odd = head, even = head.next, ehead = even;
    while (even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }
    odd.next = ehead;
    return head;
  }
}