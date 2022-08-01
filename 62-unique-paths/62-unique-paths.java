class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m + 1][n + 1];
        
        for(int[] a : dp) Arrays.fill(a, -1);
        
        return  paths( m , n, 0, 0, dp);
        

    }
    
    
    private int paths(int n, int m, int i, int j, int[][] dp) {

         if(i == n  || j == m) return 0;
        
        if(dp[i][j] != -1) return dp[i][j]; 
        
        if(i == n - 1 && j == m - 1) return 1;
        
        return dp[i][j] = paths(n, m, i + 1, j, dp) + paths(n, m, i, j + 1, dp);
        
    }
    
}