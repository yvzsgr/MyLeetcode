package Tree;

import java.util.List;

public class MaxDepthNaryTree {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int max = 0;
        for(Node child: root.children){
            max = Math.max(maxDepth(child), max);
        }
        return max + 1;

        //iterative solution
//        if(root == null) return 0;
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//
//        int depth = 0;
//
//        while(!queue.isEmpty())
//        {
//            int size = queue.size();
//
//            for(int i = 0; i < size; i++)
//            {
//                Node current = queue.poll();
//                for(Node child: current.children) queue.offer(child);
//            }
//
//            depth++;
//        }
//
//        return depth;

    }

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


}
