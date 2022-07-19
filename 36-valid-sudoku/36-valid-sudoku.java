class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
       
        for(int i = 0; i < row; i++) {
            
            for(int j = 0; j < col; j++) {
                
                if(board[i][j] != '.') {
                    
                    if(!isValid(board, i, j, board[i][j])) return false;
                    
                }
                
            }
        }
        return true;
    }
    
    boolean isValid(char[][] board,int currow, int curcol, char value) {
        
        int row = board.length;
        int col = board[0].length;
       
        
        for(int i = 0; i < row; i++) {
            
            if(i!= currow  && board[i][curcol] == value) return false;
            
        }
        
         for(int i = 0; i < col; i++) {
             
             if(i != curcol && board[currow][i] == value) return false;
             
         }
        
        int reqRow = currow - currow%3;
        int reqCol = curcol - curcol%3;
        
        for(int i = reqRow; i < reqRow + 3; i++) {
            
            for(int j = reqCol; j < reqCol + 3; j++) {
                
                if(i!= currow && j!= curcol && board[i][j] == value) return false;
                
            }
        }
        return true;
    }
}