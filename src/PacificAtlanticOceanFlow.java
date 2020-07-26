import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PacificAtlanticOceanFlow {

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<List<Integer>>();
        }
        int pacific [][] = new int [matrix.length] [matrix[0].length];
        int atlantic [][] = new int [matrix.length][matrix[0].length];

        //top and bottom
        for(int col = 0; col<matrix[0].length; col++){
            dfs(matrix, 0, col, Integer.MIN_VALUE, pacific);
            dfs(matrix, matrix.length-1, col, Integer.MIN_VALUE, atlantic);
        }

        //left and right
        for(int row = 0; row<matrix.length; row++){
            dfs(matrix, row,0, Integer.MIN_VALUE, pacific);
            dfs(matrix, row, matrix[0].length-1, Integer.MIN_VALUE, atlantic);
        }

        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(pacific[i][j] == 1 && atlantic[i][j]==1){
                    LinkedList<Integer> flow = new LinkedList<>();
                    flow.add(i);
                    flow.add(j);
                    res.add(flow);
                }
            }
        }
        return res;
    }

    public static void dfs(int [][] matrix, int row, int col, int prevVal, int [][] ocean){
        //check conditions
        if(row<0 || col<0 || row>matrix.length-1 || col>matrix[0].length-1 ){
            return;
        } else if(matrix[row][col]<prevVal){
            return;
        } else if(ocean[row][col]==1){
            return;
        }
        //process cell
        ocean [row][col] = 1;


        //call dfs as many as needed
        dfs(matrix, row-1, col, matrix[row][col], ocean);
        dfs(matrix, row+1, col, matrix[row][col], ocean);
        dfs(matrix, row, col-1, matrix[row][col], ocean);
        dfs(matrix, row, col+1, matrix[row][col], ocean);

    }
}
