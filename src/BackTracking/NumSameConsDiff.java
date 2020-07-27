package BackTracking;

import java.util.ArrayList;
import java.util.List;

//Return all non-negative integers of length N such that the absolute difference between every two
// consecutive digits is K.
//
// Note that every number in the answer must not have leading zeros except for the number 0 itself.
// For example, 01 has one leading zero and is invalid, but 0 is valid.
//
// You may return the answer in any order.


public class NumSameConsDiff {
    public int[] numsSameConsecDiff(int N, int K) {
    List<Integer> list = new ArrayList<>();
        if(N==0)
            return new int[0];
        if(N==1)
            list.add(0);      // edge case
    dfs(N, K, list, 0);
        return list.stream().mapToInt(i->i).toArray();   //list.toArray(new int[list.size()]); doesn't work for primitives
}
    public void dfs(int N, int K, List<Integer> list, int number) {
        if (N == 0) {   // base case, if you have added enough number of integers then append it to list; Here N is used as the total digits in temporary number
            list.add(number);
            return;
        }
        for (int i = 0; i < 10; ++i) {
            if (i == 0 && number == 0)    // Do not add 0 at begining of a number
                continue;
            else if (number == 0 && i != 0) {     // base case, we add all the digits when we do not have any previous digit to check if difference = K
                dfs(N - 1, K, list, i);
            } else {
                if (Math.abs((number % 10) - i) == K) {
                    dfs(N - 1, K, list, number * 10 + i);    // General dfs to add the digit at the units place and reducing the number of digits by 1.
                }
            }
        }
    }

}
