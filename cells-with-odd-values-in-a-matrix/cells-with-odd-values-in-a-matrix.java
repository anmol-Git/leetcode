class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [] a = new int[m];
        int [] b = new int[n];
        
        for(int [] i : indices){
            a[i[0]]++;
            b[i[1]]++;
        }
        
        int count = 0;
        int r = 0;
        int c =0;
        
        for(int i =0;i<m;i++){
                if(((a[i])&1) ==1) {
                    count+=n;
                    r++;
                }
        }
        
        
        for(int i =0;i<n;i++){
            if(((b[i])&1) ==1) {
                count+=m;
                c++;
            }
        }
        
        return count - 2*r*c;
    }
}