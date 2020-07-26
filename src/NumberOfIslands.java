public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfsMark(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfsMark(char [][] grid, int row, int col){
        //check necessary conditions
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1){
            return;
        }
        if(grid[row][col] == '0'){
            return;
        }

        //process cell
        grid[row][col] = '0';

        //dfs calls
        dfsMark(grid, row-1, col);
        dfsMark(grid, row+1, col);
        dfsMark(grid, row, col-1);
        dfsMark(grid, row, col+1);
    }



}
