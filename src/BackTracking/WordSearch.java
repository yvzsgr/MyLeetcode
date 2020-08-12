package BackTracking;//Given a 2D board and a word, find if the word exists in the grid.

//The word can be constructed from letters of sequentially adjacent cell,
//where "adjacent" cells are those horizontally or vertically neighboring.
//The same letter cell may not be used more than once.

//this is a classic backtracking solution. Exist method can be thought as dfs or backtrack
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++){
                if(backtrack(board, i, j, word, 0))
                    return true;
            }
        return false;
    }
    private boolean backtrack(char[][] board, int i, int j, String word, int ind){

        if(ind == word.length()) return true;
        //check condition
        if(i > board.length-1 || i <0 || j<0 || j >board[0].length-1 || board[i][j]!=word.charAt(ind))
            return false;
        //process cell
        board[i][j]='*';

        //needed dfs calls
        boolean result =    backtrack(board, i-1, j, word, ind+1) ||
                backtrack(board, i, j-1, word, ind+1) ||
                backtrack(board, i, j+1, word, ind+1) ||
                backtrack(board, i+1, j, word, ind+1);
        board[i][j] = word.charAt(ind);
        return result;
    }
}
