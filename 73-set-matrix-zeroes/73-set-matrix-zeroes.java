class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        ArrayList<Pairs> list = new ArrayList<>();
        
        for(int i = 0; i < row; i++) {
            
            for(int j = 0; j < col; j++) {
                
                if(matrix[i][j] == 0) list.add(new Pairs(i,j));
                
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            
            Pairs temp = list.get(i);
            
            for(int j = 0; j < col; j++) {
                matrix[temp.row][j] = 0;
            }
            
            for(int j = 0; j < row; j++) {
                matrix[j][temp.col] = 0;
            }
        }
    }
}

class Pairs{
    int row;
    int col;
    
    Pairs(int row,int col) {
        this.row = row;
        this.col = col;
    }
}