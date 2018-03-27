/* 
  Time complexity: O(n)

  Explanation:
  ------------
  ... if either is null, return the other
  1. Create a new Listnode merged
  2. If l1.val < l2.val, merged = l1, merged.next = merge(l1.next, l2)
  3. Else merged = l2, merged.next = merge(l1, l2.next)
  4. return merged
*/

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