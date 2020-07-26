package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    //BFS Iterative
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        //create a queue
        Queue<TreeNode> q = new LinkedList<>();
        //add root to the queue
        q.add(root);
        //loop levels
        while(!q.isEmpty()) {
            int levelSize = q.size();            //get the level size
            List<Integer> currLevel = new ArrayList<>(); //create list for current level
            //loop level one by one
            for(int i = 0; i < levelSize; i++) {
                TreeNode currNode = q.poll();
                currLevel.add(currNode.val);//add to the current level
                if (currNode.left != null)
                    q.add(currNode.left);   //add queue for next level
                if (currNode.right != null)
                    q.add(currNode.right);  //add queue for next level
            }
            //add current level to the list
            res.add(currLevel);
        }
        return res;
    }

    //DFS Recursive
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null)
//            return res;
//        levelOrderHelper(res, root, 0);
//        return res;
//    }
//
//    public void levelOrderHelper(List<List<Integer>> res, TreeNode root, int level) {
//        if (root == null)
//            return;
//        List<Integer> curr;
//        if (level >= res.size()) {
//            curr = new ArrayList<>();
//            curr.add(root.val);
//            res.add(curr);
//        } else {
//            curr = res.get(level);
//            curr.add(root.val);
//            //res.add(curr); // No need to add the curr into the res, because the res.get(index) method does not remove the index element
//        }
//        levelOrderHelper(res, root.left, level + 1);
//        levelOrderHelper(res, root.right, level + 1);
//    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }

}
