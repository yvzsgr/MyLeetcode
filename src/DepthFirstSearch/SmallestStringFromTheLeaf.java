package DepthFirstSearch;//import Tree.TreeNode;

//Given the root of a binary tree, each node has a value from 0 to 25 representing the letters
// 'a' to 'z': a value
// of 0 represents 'a', a value of 1 represents 'b', and so on.

//Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.


//We can use depth first search for this kind of question

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
