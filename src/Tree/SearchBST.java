package Tree;//import Tree.TreeNode;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null) {
            if (root.val == val)
                return root;
            else if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return null;
    }
    //recursive solution
    //        if(root == null)  // root null reuturn null
    //        return null;
    //    if(root.val == val) { // root.val is equals to val return that node
    //        return root;
    //    } else if(root.val > val) { // root.val > val which means our node is in the left subtree
    //        return searchBST(root.left, val);
    //    } else {
    //        return searchBST(root.right, val); // root.val < val which means our node is in the right subtree
    //    }

}
