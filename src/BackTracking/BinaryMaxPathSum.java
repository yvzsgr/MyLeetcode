package BackTracking;
/*Given a non-empty binary tree, find the maximum path sum.
For this problem, a path is defined as any sequence of nodes from some starting node to any
node in the tree along the parent-child connections.
The path must contain at least one node and does not need to go through the root.*/

//Basic idea:

//        store/update max during in-order traversal.
//        return maximum branches
//        a) 0
//        b)root.val
//        c)root.val + dfs(root.left)
//        d) root.val + dfs(root.right)
//        Whole situation can be broken down to four cases:
//
//        root
//        left<0 right<0
//        max = Math.max(0, root.val + 0 + 0), return Math.max(0,root.val)
//        root
//        left>0 right<0
//        max = Math.max(0, root.val + dfs(root.left) + 0), return Math.max(0, root.val + dfs(root.left))
//        root
//        left<0 right>0
//        max = Math.max(0, root.val + 0+ dfs(root.right) + 0), return Math.max(0, root.val + dfs(root.right))
//        4)root
//        left>0 right>0
//        max = Math.max(0, root.val + 0+ dfs(root.left) + dfs(root.right) ), return Math.max(0, root.val + dfs(root.left) + dfs(root.right))


public class BinaryMaxPathSum {

    int maxValue;

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        backtrack(root);
        return maxValue;
    }

    private int backtrack(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, backtrack(node.left));//less than 0, then not take left branch
        int right = Math.max(0, backtrack(node.right));//less than 0, then not take right branch
        maxValue = Math.max(maxValue, left + right + node.val);//root,left + root, right + root, left + right + root;
        return Math.max(left, right) + node.val;//take left+root or right+root or root or 0
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
