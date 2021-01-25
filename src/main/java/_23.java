import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/submissions/">23. Merge k Sorted Lists</a>
 */

public class _23 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            else if (lists.length == 1) {
                return lists[0];
            }
            else {
                boolean needExit = true;
                for (int i = 0; i < lists.length; ++i) {
                    if (lists[i] != null) {
                        needExit = false;
                        break;
                    }
                }
                if (needExit) {
                    return lists[0];
                }
            }

            ListNode result = null;
            ListNode current = null;
            while (true) {
                int minIdx = getMinIdx(lists);

                if(result == null) {
                    result = new ListNode(lists[minIdx].val);
                    current = result;
                }
                else {
                    current.next = new ListNode(lists[minIdx].val);
                    current = current.next;
                }

                if (lists[minIdx].next != null) {
                    lists[minIdx] = lists[minIdx].next;
                }
                else {
                    lists[minIdx] = null;
                }

                if (needStop(lists)) {
                    break;
                }
            }
            return result;
        }

        public int getMinIdx(ListNode[] lists) {
            int minIdx = 0;
            ListNode minvalue = null;
            for (int i = 0; i < lists.length; ++i) {
                if (lists[i] != null) {
                    minIdx = i;
                    minvalue = lists[i];
                    break;
                }
            }
            for (int i = minIdx; i < lists.length; ++i) {
                if (lists[i] != null && lists[i].val < minvalue.val) {
                    minvalue = lists[i];
                    minIdx = i;
                }
            }
            return minIdx;
        }

        public boolean needStop(ListNode[] lists) {
            for (ListNode node : lists) {
                if (node != null) {
                    return false;
                }
            }
            return true;
        }
    }
}
