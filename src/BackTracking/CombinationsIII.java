package BackTracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/discuss/16878/Combination-Sum-I-II-and-III-Java-solution-(see-the-similarities-yourself)


public class CombinationsIII {


/*Pick a starting point.
while(Problem is not solved)
For each path from the starting point.
check if selected path is safe, if yes select it
and make recursive call to rest of the problem
before which undo the current move.
End For
If none of the move works out, return false, NO SOLUTON.*/

        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> ans = new ArrayList<>();
            combination(ans, new ArrayList<Integer>(), k, 1, n);
            return ans;
        }

        private void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
            //check base condition
            if (comb.size() == k && n == 0) {
                List<Integer> li = new ArrayList<Integer>(comb);
                ans.add(li);
                return;
            }
            for (int i = start; i <= 9; i++) {

                comb.add(i);
                //make recursive call
                combination(ans, comb, k, i+1, n-i);
                //undo the current move
                comb.remove(comb.size() - 1);
            }
        }
}
