class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;
        int range = 0;
        
        for(int i : nums) range += i;
        
        //  s1 - (s2) = target
        // s1 + s2 = range
        // s1 = (range + target) / 2
        
        if((range-target)%2==1 || (target>range))  return 0;
        
        int subset = (range - target)/2;
        if(subset < 0) return 0;
        int[][] dp = new int[n + 1][subset + 1];
        
        for(int i = 0; i <= n; i++) dp[i][0] = 1;
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 0; j <= subset; j++) {
                
                if(nums[i - 1] <= j) {
                    
                   dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                }
                else dp[i][j] = dp[i -1][j];
            }
        }
        return dp[n][subset];
    }
}