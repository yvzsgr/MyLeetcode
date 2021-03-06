package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

//Given a binary tree, return all root-to-leaf paths.
//
//Note: A leaf is a node with no children.

//This can be solved via depth first search

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(res, root, sb);
        return res;
    }

    private void helper(List<String> res, TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) { //check whether there is leaf or not.
            res.add(sb.toString());
        } else {
            sb.append("->");
            helper(res, root.left, sb);
            helper(res, root.right, sb);
        }
        sb.setLength(len);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
