package BackTracking;//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

//Solution approach is backtracking
/*Pick a starting point.
while(Problem is not solved)
For each path from the starting point.
check if selected path is safe, if yes select it
and make recursive call to rest of the problem
before which undo the current move.
End For
If none of the move works out, return false, NO SOLUTON.*/




import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(result,new ArrayList<Integer>(), 1, n,k);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> comb, int start, int n, int k){

        if(k==0) {
            result.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            //make recursive call
            backtrack(result, comb, i+1, n, k-1);
            //undo the current move
            comb.remove(comb.size()-1);
        }
    }
}
