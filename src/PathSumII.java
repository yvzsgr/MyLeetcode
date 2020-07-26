//import Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result  = new LinkedList<List<Integer>>();
    List<Integer> currentResult  = new LinkedList<Integer>();
    pathSum(root,sum,currentResult,result);
	return result;
}

    public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
                        List<List<Integer>> result) {

        if (root == null)
            return;
        currentResult.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new LinkedList(currentResult));
            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
            return;
        } else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);

    }
}

//Another solution is with ArrayList.The time complexity is less when using linkedlist due to insertion/deletion operation

//    List<List<Integer>> res;
//    public List<List<Integer>> pathSum(Tree.TreeNode root, int sum) {
//        res = new LinkedList();
//        dfs(root, sum, new LinkedList());
//        return res;
//    }
//
//    public void dfs(Tree.TreeNode root, int sum, LinkedList<Integer> path){
//
//        if(root == null) return;
//
//        path.add(root.val);
//        if(root.left == null && root.right == null && sum == root.val) res.add(new LinkedList(path));
//        dfs(root.left, sum - root.val, path);
//        dfs(root.right, sum - root.val, path);
//        path.removeLast();
//    }

