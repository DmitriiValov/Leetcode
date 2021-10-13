import utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */

public class _206 {

    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode result = null;
            while (head != null) {
                if (result == null) {
                    result = new ListNode(head.val);
                }
                else {
                    result = new ListNode(head.val, result);
                }
                head = head.next;
            }
            return result;
        }
    }
}
