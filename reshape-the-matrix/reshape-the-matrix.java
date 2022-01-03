class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int [] arr = new int[r*c];
        int row = mat.length;
        int col = mat[0].length;
        
        if(row * col != r*c) return mat;
        
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i*col + j] = mat[i][j]; 
            }
        }
        int[][] ans = new int[r][c];
        
        for(int i =0;i<arr.length;i++){
            ans[i/c][i%c] = arr[i]; 
        }
        return ans;
    }
}