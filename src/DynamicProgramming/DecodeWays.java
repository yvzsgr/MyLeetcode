package DynamicProgramming;//dp[i]: represents possible decode ways to the ith char(include i), whose index in string is i-1
//
//        Base case: dp[0] = 1 is just for creating base; dp[1], when there's one character, if it is not zero, it can only be 1 decode way. If it is 0, there will be no decode ways.
//
//        Here only need to look at at most two digits before i, cuz biggest valid code is 26, which has two digits.
//
//        For dp[i]: to avoid index out of boundry, extract substring of (i-1,i)- which is the ith char(index in String is i-1) and substring(i-2, i)
//
//        First check if substring (i-1,i) is 0 or not. If it is 0, skip it, continue right to check substring (i-2,i), cuz 0 can only be decode by being together with the char before 0.
//
//        Second, check if substring (i-2,i) falls in 10~26. If it does, means there are dp[i-2] more new decode ways.
//
//        Time: should be O(n), where n is the length of String
//        Space: should be O(n), where n is the length of String



public class DecodeWays {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }

}
