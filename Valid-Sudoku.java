class Solution {
    public boolean isValid(char[][] board,int row,int col,char num){
        //for row
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //for col
         for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
        }
        //3*3 matrix
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++ ){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(board[i][j]=='.') continue;
                board[i][j]='.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j]=num;
            }
        }
        return true;
    }
}