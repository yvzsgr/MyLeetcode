import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        int length = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        if (set.size() == length) {
            return false;
        } else {
            return true;
        }
    }
}
