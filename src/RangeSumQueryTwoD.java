
//Given a 2D matrix matrix, find the sum of the elements inside the rectangle
//defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

public class RangeSumQueryTwoD {

    /**
     * sub-problem: dp[i][j] represents preSum of all elements in the rectangle area between (0,0) to (i-1, j-1)
     * base case: dp[1][1] = matrix[0][0]
     * recurrence relation: dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
     * explanation: top rectangle sum + left rectangle sum - top left common rectangle + new value at current point
     * */
    int[][] dp;
    public void NumMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        int n = matrix.length;
        int m = matrix[0].length;

        dp = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row2 + 1][col1] - dp[row1][col2 + 1] + dp[row1][col1];
    }
}
