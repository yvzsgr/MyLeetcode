package Tree;

public class BinaryTreeLongestConsecutiveSequence {

    public int longestConsecutive(TreeNode root){
        int [] max = new int[1];
        findLongestConsecutive(root, 0,0,max);
        return max[0];
    }

    public void findLongestConsecutive(TreeNode root, int count, int target, int [] max){
        if(root == null){
            return;
        } else if(root.val == target){
            count++;
        } else {
            count=1;
        }

        max[0] = Math.max(max[0], count);

        findLongestConsecutive(root.left, count, root.val+1, max);
        findLongestConsecutive(root.right, count, root.val+1, max);

    }

}
