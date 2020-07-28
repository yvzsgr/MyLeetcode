package Tree;//import Tree.TreeNode;

public class MaxDepthOfTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            /* use the larger one */
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

}
