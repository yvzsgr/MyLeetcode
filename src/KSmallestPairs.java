import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> que = new PriorityQueue<>((a, b) -> a.get(0) + a.get(1) - b.get(0) - b.get(1));
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return res;
        for (int i = 0; i < nums1.length && i < k; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[i]);
            temp.add(nums2[0]);
            temp.add(0);
            que.offer(temp);
        }
        while (k-- > 0 && !que.isEmpty()) {
            List<Integer> cur = que.poll();
            res.add(new ArrayList<Integer>(Arrays.asList(cur.get(0), cur.get(1))));
            if (cur.get(2) == nums2.length - 1) continue;
            List<Integer> temp = new ArrayList();
            temp.add(cur.get(0));
            temp.add(nums2[cur.get(2) + 1]);
            temp.add(cur.get(2) + 1);
            que.offer(temp);
        }
        return res;
    }
}
