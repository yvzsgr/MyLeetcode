package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBST {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return result; //check base case
        q.add(root); //add root to queue
        while(!q.isEmpty()) {  //loop until q is empty
            int n = q.size();
            double sum = 0.0;
            for(int i = 0; i < n; i++) { //goes all nodes at that level
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) q.offer(node.left); //add child to queue
                if(node.right != null) q.offer(node.right); //add child to queue
            }
            result.add(sum / n); //since it is asking average we are dividing, if it asks sum we will keep
        }
        return result;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

}
