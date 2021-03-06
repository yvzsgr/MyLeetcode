package Tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreOrder {

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return result;
        result.add(root.val);
        for (Node node : root.children)
            preorder(node);
        return result;
    }

    // Definition for a Node.
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
