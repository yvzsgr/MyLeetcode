package DynamicProgramming;//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//The robot can only move either down or right at any point in time.
//The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//How many possible unique paths are there?

//this is a perfect example of dynamic programming
// similar questions are
//91 decode ways
//70 climbing stairs
//509 fibonacci numbers

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }
}
