//import Tree.TreeNode;

public class SumRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return helper(root, 0);
    }

    private int helper(TreeNode root, int prevSum) {
        if(root==null) {
            return 0;
        }
        prevSum = 2*prevSum + root.val;

        if(root.left == null && root.right == null) {
            return prevSum; //leaf node return the sum until root
        }
        return helper(root.left, prevSum) + helper(root.right, prevSum);
    }



}


//Another version of the question
/*Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

        An example is the root-to-leaf path 1->2->3 which represents the number 123.

        Find the total sum of all root-to-leaf numbers.*/
//public int sumNumbers(Tree.TreeNode root) {
//    return sumNodes(root, 0);
//}
//
//    private int sumNodes(Tree.TreeNode root, int currentSum) {
//        if (root == null) return 0;
//        //the only difference from above solution is that it multiply currentsum by 10 instead of 2
//        currentSum = currentSum * 10 + root.val;
//        if (root.left == null && root.right == null) return currentSum;
//        int leftSum = sumNodes(root.left, currentSum);
//        int rightSum = sumNodes(root.right, currentSum);
//        return leftSum + rightSum;
//    }
