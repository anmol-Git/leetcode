class Solution {
    public void rotate(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i < row; i++) {
            
            for(int j = i; j < col; j++) {
                
                swap(matrix, i, j, j, i);
                
            }
        }
        
        for(int i = 0; i < row; i++) {
            
            int start = 0;
            int end = col - 1;
            
            while(start <= end) {
                
                swap(matrix, i, start, i, end);
                
                start++;
                end--;
            }
        }
    }
    
    void swap(int[][] matrix,int irow, int icol, int frow, int fcol) {
        int temp = matrix[irow][icol];
        matrix[irow][icol] = matrix[frow][fcol];
        matrix[frow][fcol] = temp;
    }
}