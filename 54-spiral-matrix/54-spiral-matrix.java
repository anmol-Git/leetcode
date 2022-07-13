class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        int uRow = 0;
        int dRow = matrix.length - 1;
        int rCol = matrix[0].length - 1;
        int lCol = 0;
        
        while(uRow <= dRow && lCol <= rCol) {
            
            int i = lCol;
            while(i <= rCol) list.add(matrix[uRow][i++]);
            
            uRow++;
            
            i = uRow;
            while(i <= dRow) list.add(matrix[i++][rCol]);
            
            rCol--;
            
            if(uRow > dRow || rCol < lCol) return list;
            
            i = rCol;
            while(i >= lCol) list.add(matrix[dRow][i--]);
            
            dRow--;
            
            i = dRow;
            
            while(i >= uRow) list.add(matrix[i--][lCol]);
            
            lCol++;
        }
            
        return list;
    }
}