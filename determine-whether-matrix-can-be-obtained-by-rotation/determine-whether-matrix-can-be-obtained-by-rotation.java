class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i =0;i<4;i++){
            if(isEqual(mat,target)) return true;
            rotate(mat);
        }
        return false;
    }
    
    boolean isEqual(int[][]a,int [][]b){
        
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                if(a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
    
    void rotate(int [][]a){
        tranpose(a);
        
         for(int i =0;i<a.length;i++){
            int start =0;
             int end = a.length-1;
             
             while(start<end){
                int temp =a[i][start];
                a[i][start]=a[i][end];
                a[i][end] = temp;
                 start++;
                 end--;
             }
        }
    }
    
    void tranpose(int[][] a){
        
         for(int i =0;i<a.length;i++){
            for(int j =i;j<a[0].length;j++){
                int temp = a[i][j];
               a[i][j] = a[j][i];
               a[j][i] = temp;
            }
        }
    }
}