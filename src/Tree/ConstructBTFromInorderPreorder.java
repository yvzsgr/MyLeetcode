package Tree;//the logic is here https://www.youtube.com/watch?v=2bPquh44uzo


//import Tree.TreeNode;

import java.util.HashMap;
import java.util.Map;


public class ConstructBTFromInorderPreorder {

    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }
    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        //1. break the recursion
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }
        //2. find the tree root, which is the first value of
        TreeNode root = new TreeNode(preorder[preStart]); // 3
        //3. find root in the inorder, then left of root will be left tree, right of root will be right tree.
        int rootIndex = inorderMap.get(root.val);
        int numsOnLeft = rootIndex - inStart; // 1 - 0

        //4. root left will go over of inorder everything left on the root
        root.left = build(preorder, preStart + 1, preStart + numsOnLeft, inorder, inStart, rootIndex - 1);
        //5. root right will go over of inorder everyhting right on the right
        root.right = build(preorder, preStart + numsOnLeft + 1, preEnd, inorder, rootIndex + 1, inEnd);
        return root;
    }


}
