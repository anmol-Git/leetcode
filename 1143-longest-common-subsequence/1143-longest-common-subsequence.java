class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        int n = s1.length();
        int m = s2.length();
        
        int[][] dp = new int[n + 1][m + 1];
        
        for(int[] a : dp) Arrays.fill(a, -1);
        
        lcs(s1, s2, n, m, dp);
        
        return dp[n][m];
    }
    
    int lcs(String s1, String s2, int n, int m, int[][] dp) {
        
        if(dp[n][m] != -1) return dp[n][m];
        
        if(n == 0 || m == 0) return dp[n][m] = 0;
        
        if(s1.charAt(n - 1) == s2.charAt(m - 1)) return dp[n][m] = 1 + lcs(s1, s2, n - 1, m - 1, dp);
        
        return dp[n][m] = Math.max(lcs(s1, s2, n - 1, m, dp), lcs(s1, s2, n, m - 1, dp));
        
    }
}