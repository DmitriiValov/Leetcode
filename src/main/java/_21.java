import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 */

public class _21 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        _21.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, _21.ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _21.ListNode listNode = (_21.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result = null;
            ListNode current = null;
            while (l1 != null || l2 != null) {
                if (l1 != null && (l2 == null || l1.val < l2.val)) {
                    if (result == null) {
                        result = new ListNode(l1.val);
                        current = result;
                    }
                    else {
                        current.next = new ListNode(l1.val);
                        current = current.next;
                    }
                    l1 = l1.next;
                }
                else {
                    if (result == null) {
                        result = new ListNode(l2.val);
                        current = result;
                    }
                    else {
                        current.next = new ListNode(l2.val);
                        current = current.next;
                    }
                    l2 = l2.next;
                }
            }
            return result;
        }
    }
}
