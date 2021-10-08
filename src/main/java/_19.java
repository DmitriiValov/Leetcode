import utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 */

public class _19 {

    public static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first = head;
            ListNode second = head;
            while (first.next != null) {
                if (n <= 0) {
                    second = second.next;
                }
                first = first.next;
                --n;
            }
            if (n > 0) {
                head = head.next;
            }
            else {
                second.next = second.next.next;
            }
            return head;
        }
    }
}
