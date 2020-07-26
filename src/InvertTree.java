//import Tree.TreeNode;

public class InvertTree {

    //recursion is easy but might cause stack overflow

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    //iterative solution with Stack
//    public Tree.TreeNode invertTree(Tree.TreeNode root) {
//
//        if (root == null) {
//            return null;
//        }
//
//        final Deque<Tree.TreeNode> stack = new LinkedList<>();
//        stack.push(root);
//
//        while(!stack.isEmpty()) {
//            final Tree.TreeNode node = stack.pop();
//            final Tree.TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//
//            if(node.left != null) {
//                stack.push(node.left);
//            }
//            if(node.right != null) {
//                stack.push(node.right);
//            }
//        }
//        return root;
//    }

}
