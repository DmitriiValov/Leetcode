import utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */

public class _876 {

    public static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next;
                if (fast != null) {
                    fast = fast.next;
                }
                slow = slow.next;
            }
            return slow;
        }
    }
}
