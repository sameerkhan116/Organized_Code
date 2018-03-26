class palindromeLL {
  public boolean palindrome(ListNode head) {
    if (head == null)
      return false;
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null) {
      slow = slow.next;
    }

    slow = reverse(slow);
    fast = head;

    while (slow != null) {
      if (slow.val != fast.val)
        return false;
      slow = slow.next;
      fast = fast.next;
    }
    return false;
  }

  public ListNode reverse(ListNode node) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}