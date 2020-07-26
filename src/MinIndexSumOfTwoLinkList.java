import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MinIndexSumOfTwoLinkList {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            System.out.println("restaurant name " + list1[i] + " index " + i);
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            System.out.println(j);
            if (j != null && i + j <= minSum) {
                if (i + j < minSum) {
                    res.clear();
                    minSum = i + j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

}
