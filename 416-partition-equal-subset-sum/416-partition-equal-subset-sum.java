class Solution {
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        
        if((sum&1) == 1) return false;
        
        return containsSum(nums, sum/2, n);
    }
    
    boolean containsSum(int[] nums, int sum, int n) {
        
        boolean[][] dp = new boolean[n + 1][sum + 1];
        
        for(int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= sum; j++) {
                
                if(nums[i - 1] <= j) {
                    
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                
                }
                
                else dp[i][j] = dp[i - 1][j];
                
            }
        }
        
        return dp[n][sum];
    }
}