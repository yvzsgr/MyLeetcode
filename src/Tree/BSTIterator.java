package Tree;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class Tree.TreeNode {
 *     int val;
 *     Tree.TreeNode left;
 *     Tree.TreeNode right;
 *     Tree.TreeNode() {}
 *     Tree.TreeNode(int val) { this.val = val; }
 *     Tree.TreeNode(int val, Tree.TreeNode left, Tree.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {

    private final Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();

        // Traversal cur node's right branch
        TreeNode cur = node.right;
        while (cur != null){
            stack.push(cur);
            cur = cur.left;
        }

        return node.val;
    }
}
