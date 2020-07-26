public class SmallestStringFromTheLeaf {
    private String answer = "~";
    public String smallestFromLeaf(TreeNode root) {
        return dfs(root, "");
    }
    private String dfs(TreeNode root, String str) {
        if (root == null) { return str; } // base case, and in case root is null.
        str = (char)(root.val + 'a') + str; // prepend current char to the path string from root.
        if (root.left == null && root.right == null && answer.compareTo(str) > 0) {
            answer = str; // update answer if root is a leaf.
        }
        dfs(root.left, str); // recursion to the left branch.
        dfs(root.right, str); // recursion to the right branch.
        return answer;
    }
}
