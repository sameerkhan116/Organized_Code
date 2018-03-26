class mergeSortedLL {
  public ListNode merge(ListNode l1, ListNode l2) {
    if (l1 == null)
      return l2;
    if (l2 == null)
      return l1;

    ListNode merged;
    if (l1.val < l2.val) {
      merged = l1;
      merged.next = merge(l1.next, l2);
    } else {
      merged = l2;
      merged.next = merge(l1, l2.next);
    }
    return merged;
  }
}