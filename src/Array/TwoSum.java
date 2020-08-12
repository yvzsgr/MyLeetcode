package Array;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int res;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            res = target - nums[i];
            if (map.containsKey(res)) {
                result[0] = map.get(res);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;

    }
}
