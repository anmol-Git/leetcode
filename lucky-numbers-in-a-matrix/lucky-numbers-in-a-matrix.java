class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        for(int i =0;i<matrix.length;i++){
            int minInd = getMin(matrix[i]);
            if(isLucky(matrix,i,minInd)) list.add(matrix[i][minInd]);
        }
        return list;
    }
    
    int getMin(int[] arr){
        int min =Integer.MAX_VALUE;
        int index =0;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){ min = arr[i]; index = i; }         
        }
        return index;
    }
    
    boolean isLucky(int[][] mat, int i,int j){
        for(int k=0;k<mat.length;k++){
            if(mat[i][j] < mat[k][j]) return false;
        }
        return true;
    }
}