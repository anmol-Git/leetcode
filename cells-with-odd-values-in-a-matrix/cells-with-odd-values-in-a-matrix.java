class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [] a = new int[m];
        int [] b = new int[n];
        
        for(int [] i : indices){
            a[i[0]]++;
            b[i[1]]++;
        }
        
        int count = 0;
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(((a[i] + b[j])&1) ==1) count++;
            }
        }
        return count;
    }
}