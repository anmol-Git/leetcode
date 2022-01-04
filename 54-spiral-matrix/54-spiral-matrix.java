class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int uRow = 0;
        int rCol = mat[0].length-1;
        int dRow = mat.length-1;
        int lCol = 0;
        
        while(lCol<=rCol && uRow<=dRow){
            
            for(int i =lCol;i<=rCol;i++){
                list.add(mat[uRow][i]);
            }
            uRow++;
            
            for(int i =uRow;i<=dRow;i++){
                list.add(mat[i][rCol]);
            }
            rCol--;
            if(uRow>dRow || rCol<lCol) return list;
            for(int i =rCol;i>=lCol;i--){
                list.add(mat[dRow][i]);
            }
            dRow--;
            
            for(int i =dRow;i>=uRow;i--){
                list.add(mat[i][lCol]);
            }
            lCol++;
        }
        return list;
    }
}