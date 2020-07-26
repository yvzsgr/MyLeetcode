import java.util.ArrayList;
import java.util.List;

public class NaryTreePostOrder {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null) return list;

        for(Node node: root.children)
            postorder(node);

        list.add(root.val);
        return list;
    }

    // Definition for a Node.
    private class Node {
        public int val;
        public List<NaryTreePostOrder.Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<NaryTreePostOrder.Node> _children) {
            val = _val;
            children = _children;
        }
    }


}
