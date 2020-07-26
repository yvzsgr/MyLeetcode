//import Tree.TreeNode;

public class MergeBST {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        else if(t1 == null) return t2;
        else if(t2 == null) return t1;
        TreeNode n= new TreeNode(t1.val+t2.val);
        n.left=mergeTrees(t1.left, t2.left);
        n.right=mergeTrees(t1.right, t2.right);
        return n;
    }

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
}
