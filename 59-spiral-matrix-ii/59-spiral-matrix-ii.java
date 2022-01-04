class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        
        int counter = 1;
        
        int uRow = 0;
        int rCol = n-1;
        int dRow = n-1;
        int lCol = 0;
        
        while(lCol<=rCol && uRow<=dRow){
            
            for(int i =lCol;i<=rCol;i++){
                mat[uRow][i] = counter++;
            }
            uRow++;
            
            for(int i =uRow;i<=dRow;i++){
                mat[i][rCol] = counter++;
            }
            rCol--;
            
            if(uRow>dRow || rCol<lCol) return mat;
            
            for(int i =rCol;i>=lCol;i--){
             mat[dRow][i] =counter++;
            }
            dRow--;
            
            for(int i =dRow;i>=uRow;i--){
                mat[i][lCol] = counter++;
            }
            lCol++;
        }
        
        return mat;
    }
}