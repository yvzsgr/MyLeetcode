package Tree;

public class VisibleTree {

    public static int countVisibleNodes(TreeNode root) {
        // Start maxSoFar with smallest integer value possible so any value root has is smaller than it
        return dfs(root, Integer.MIN_VALUE);
    }

    private static int dfs(TreeNode root, int maxSoFar) {
        if (root == null) return 0;
        int total = 0;
        if (root.val >= maxSoFar) {
            total++;
        }
        // maxSoFar of the child node is the larger value of previous max and current node val
        total += dfs(root.left, Math.max(maxSoFar, root.val));
        total += dfs(root.right, Math.max(maxSoFar, root.val));

        return total;
    }


}
