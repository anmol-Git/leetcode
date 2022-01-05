class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] mat = new int[rows*cols][2];
        
        int counter = 2;
        int index = 0;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while(index<mat.length){
            for(int i =0;i<counter/2;i++){
                
                if(rStart >=0 &&  rStart<rows && cStart>=0 && cStart<cols)
                    mat[index++] = new int[]{rStart,cStart};
                int d = (counter+2)%4;
                rStart +=dirs[d][0];
                cStart +=dirs[d][1];
            }
            counter++;
        }
        return mat;
    }
}