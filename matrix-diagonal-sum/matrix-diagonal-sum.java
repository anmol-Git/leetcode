class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        
        int row = 0;
        int col = 0;
        
        while(row<mat.length){
            sum+=mat[row][col];
            col++;
            row++;
        }
        row = mat.length-1;
        col = 0;
        
        while(row>=0){
            sum+= mat[row][col];
            row--;
            col++;
        }
        
        if((mat.length&1) == 1){
            row =mat.length/2;
            col = mat.length/2;
            sum-= mat[row][col];
        }
        
        return sum;
    }
}