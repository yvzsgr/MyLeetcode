package BackTracking;/*Pick a starting point.
while(Problem is not solved)
For each path from the starting point.
check if selected path is safe, if yes select it
and make recursive call to rest of the problem
before which undo the current move.
End For
If none of the move works out, return false, NO SOLUTON.*/


import java.util.ArrayList;
import java.util.List;

public class Permutations {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
