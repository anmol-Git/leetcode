class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        
        int[] dp = new int[n];
        
        dp[0] = 1;
        
        int res = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            
            int max = 0;
            
            for(int j = 0; j < i; j++) {
                
               if(nums[i] > nums[j]) {
                    if(max < dp[j]) max = dp[j];
               }
                
            }
            
            dp[i] = 1 + max;
            
            res = Math.max(dp[i], res);
            
        }
        
        return res;
    }
}