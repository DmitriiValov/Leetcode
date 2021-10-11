package utils;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode() {
        this.left = null;
        this.right = null;
        this.next = null;
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.next = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right, TreeNode next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        boolean leftEquals;
        if (left != null) {
            leftEquals = left.equals(treeNode.left);
        }
        else {
            leftEquals = treeNode.left == null;
        }
        boolean rightEquals;
        if (right != null) {
            rightEquals = right.equals(treeNode.right);
        }
        else {
            rightEquals = treeNode.right == null;
        }
        boolean nextEquals;
        if (next != null) {
            nextEquals = next.equals(treeNode.next);
        }
        else {
            nextEquals = treeNode.next == null;
        }

        return val == treeNode.val && leftEquals && rightEquals && nextEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
