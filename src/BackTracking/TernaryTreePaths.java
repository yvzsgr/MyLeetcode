package BackTracking;

import java.util.ArrayList;

public class TernaryTreePaths {

    static class Node {
        int val;
        Node[] children;

        public Node(int val, Node[] children) {
            this.val = val;
            this.children = children;
        }
    }


    public static String[] ternaryTreePaths(Node root) {
        if (root == null) return null;
        ArrayList<String> res = new ArrayList<>();
        dfs(root, new ArrayList<>(), res);
        return res.toArray(new String[res.size()]);
    }

    // dfs helper function
    private static void dfs(Node root, ArrayList<String> path, ArrayList<String> res) {
        // exit condition, reached leaf node, append paths to results
        if (root.children[0] == null && root.children[1] == null && root.children[2] == null) {
            path.add(Integer.toString(root.val));
            res.add(String.join("->", path));
            return;
        }

        // dfs on each non-null child
        for (Node child : root.children) {
            if (child != null) {
                ArrayList<String> pathCopy = new ArrayList<>(path);
                pathCopy.add(Integer.toString(root.val));
                dfs(child, pathCopy, res);
            }
        }
    }
}
