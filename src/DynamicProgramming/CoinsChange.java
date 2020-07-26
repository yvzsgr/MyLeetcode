package DynamicProgramming;//You are given coins of different denominations and a total amount of money amount.
//Write a function to compute the fewest number of coins that you need to make up that amount.
//If that amount of money cannot be made up by any combination of the coins, return -1.

//it is asked optimization and dynamic programming approach seems suitable
//if it is asked the combination of coins to make it that number, it should be solved by backtracking
//Check out the leetcode solution https://leetcode.com/problems/coin-change/solution/
//Ex :
//1,3,5,15
//21

import java.util.Arrays;

public class CoinsChange {

    public int coinChange(int[] coins, int amount) {
        if(amount == 0 && coins.length == 0){
            return -1;
        }

        int [] dp = new int [amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        //coins.length =3 and amount = 21
        for(int i =0; i<coins.length; i++){
            for(int j=coins[i]; j<=amount; j++){
                dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
            }
        }
        return dp[amount] == amount+1?-1:dp[amount];
    }
}