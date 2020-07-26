package DynamicProgramming;//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top


//this is dynamic programming question. It can be written as below

//public int climbStairs(int n) {
//        if (n == 1) {
//        return 1;
//        }
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= n; i++) {
//           dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//}
// Above we are using O(N) space. Actually dp[] is just like a
// fibonacci number and we will find n'th fibonacci number so we can write like below
// which makes O(1) space


public class ClimbingStars {
    public int climbStairs(int n){
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}
