class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int [] rowArr = new int[row];
        int [] colArr = new int[col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(matrix[i][j] == 0) {
                    rowArr[i] =1;
                    colArr[j] =1;
                }
            }
        }
        for(int i =0;i<rowArr.length;i++){
            for(int j =0;j<colArr.length;j++){
                
                if(rowArr[i] == 1 && colArr[j] == 1){
                    for(int k=0;k<col;k++) matrix[i][k]=0;
                    for(int m =0;m<row;m++) matrix[m][j]=0;
                }   
            }
        } 
    }
}