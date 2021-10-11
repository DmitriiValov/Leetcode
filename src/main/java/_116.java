import utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/">116. Populating Next Right Pointers in Each Node</a>
 */

public class _116 {
    public static class Solution {

        public TreeNode connect(TreeNode root) {
            if (root == null) {
                return root;
            }
            connect(root.left, root.right);
            return root;
        }

        private void connect(TreeNode left, TreeNode right) {
            if(left == null) {
                return;
            }
            left.next = right;
            connect(left.left, left.right);
            connect(left.right, right.left);
            connect(right.left, right.right);
        }
    }
}
