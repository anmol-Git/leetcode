class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i = 0; i < col; i++) {
            
            int rowd = 0;
            int cold = i;
            
            ArrayList<Integer> arr = new ArrayList<>();
            while(cold < col && rowd < row) {
                  arr.add(mat[rowd][cold]);
                    rowd++;
                    cold++;
            }
            
            Collections.sort(arr);
            rowd = 0;
            cold = i;

            
            while(cold<col && rowd < row) {
                mat[rowd][cold] = arr.get(rowd);
                rowd++;
                cold++;
            }   
        }
        
        for(int i = 1; i < row; i++) {
             
            int rowd = i;
            int cold = 0;
            
            ArrayList<Integer> arr = new ArrayList<>();
            while(cold < col && rowd < row) {     
                  arr.add(mat[rowd][cold]);
                    rowd++;
                    cold++;
            }
            
            Collections.sort(arr);
            rowd = i;
            cold = 0;
            while(cold < col && rowd < row) {
                mat[rowd][cold] = arr.get(cold);
                rowd++;
                cold++;
            }   
        }
        
        return mat;
    }
}