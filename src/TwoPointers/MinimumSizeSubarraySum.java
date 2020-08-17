package TwoPointers;

//Given an array of n positive integers and a positive integer s,
//find the minimal length of a contiguous subarray of which the sum ≥ s.
//If there isn't one, return 0 instead.


public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0, from = 0, win = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                win = Math.min(win, i - from + 1);
                sum -= nums[from++];
            }
        }
        return (win == Integer.MAX_VALUE) ? 0 : win;
    }
}
