class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        return minNumber(n, Integer.MAX_VALUE, dp);
    }
    
    int minNumber(int n, int min,int[] dp) {
        
        if(dp[n] != 0) return dp[n];
        if(n <= 3) return dp[n] = n;
        
        for(int i = 1; i*i <= n; i++) {
            
            min = Math.min(min, 1 + minNumber(n - (i*i), min, dp));
            
        }
        return dp[n] = min;
    }
}