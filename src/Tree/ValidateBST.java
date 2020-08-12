package Tree;

public class ValidateBST {
        public boolean isValidBST(TreeNode root) {
            // root is always valid
            return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        private static boolean dfs(TreeNode root, int min, int max) {
            // empty nodes are always valid
            if (root == null) return true;
            if (min > root.val || root.val > max) {
                return false;
            }
            return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
        }
}
