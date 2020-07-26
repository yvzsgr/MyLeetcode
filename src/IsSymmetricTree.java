import java.util.Stack;

public class IsSymmetricTree {

    public boolean IsSymmetric(TreeNode root){
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode n1 = stack.pop(), n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }

    //recursive solution
//    public boolean isSymmetric(TreeNode root) {
//        return root==null || isSymmetricHelp(root.left, root.right);
//    }
//
//    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
//        if(left==null || right==null)
//            return left==right;
//        if(left.val!=right.val)
//            return false;
//        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
//    }

}


// Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

//    public void add(int value) {
//
//          treeNode = addRecursive(treeNode, value);
//    }



  }
