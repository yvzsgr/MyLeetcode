public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++){
                if(exist(board, i, j, word, 0))
                    return true;
            }
        return false;
    }
    private boolean exist(char[][] board, int i, int j, String word, int ind){

        if(ind == word.length()) return true;
        //check condition
        if(i > board.length-1 || i <0 || j<0 || j >board[0].length-1 || board[i][j]!=word.charAt(ind))
            return false;
        //process cell
        board[i][j]='*';

        //needed dfs calls
        boolean result =    exist(board, i-1, j, word, ind+1) ||
                exist(board, i, j-1, word, ind+1) ||
                exist(board, i, j+1, word, ind+1) ||
                exist(board, i+1, j, word, ind+1);
        board[i][j] = word.charAt(ind);
        return result;
    }



}
