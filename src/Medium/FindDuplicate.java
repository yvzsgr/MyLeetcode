package Medium;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }

    //another solution which uses O(1) space
    // Find the intersection point of the two runners.
//    int tortoise = nums[0];
//    int hare = nums[0];
//    do {
//        tortoise = nums[tortoise];
//        hare = nums[nums[hare]];
//    } while (tortoise != hare);
//
//    // Find the "entrance" to the cycle.
//    tortoise = nums[0];
//    while (tortoise != hare) {
//        tortoise = nums[tortoise];
//        hare = nums[hare];
//    }
//
//    return hare;
}
