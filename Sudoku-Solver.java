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
    static int check=0;
    public void solver(char[][] board,int row,int col){
        if(row==9){
            check=1;
            return;
        }
        else if(board[row][col]!='.'){
            if(col!=8) solver(board,row,col+1);
            else solver(board,row+1,0);
        }
        else{
            for(char ch='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col]=ch;
                    if(col!=8) solver(board,row,col+1);
                     else solver(board,row+1,0);
                    if(check==1) return;
                    board[row][col]='.';
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
        solver(board,0,0);
        check=0;
    }
}