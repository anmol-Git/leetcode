class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;

        int[][] dp = new int[n + 1][n + 1];
        for(int[] i : dp)Arrays.fill(i, -1);
        return lis(nums, 0, -1, dp);
    }
    
    
    int lis(int[] nums,int i, int prev, int[][] dp) {
        
         if(i == nums.length) return 0;
        
        if(dp[i][prev + 1] != -1) return dp[i][prev + 1];
        
        
        if(prev == -1 || nums[i] > nums[prev]) return dp[i][prev + 1] =                  Math.max(1 + lis(nums, i + 1, i, dp), lis(nums, i + 1, prev, dp));
        
        return dp[i][prev + 1] =  lis(nums, i + 1, prev, dp);
        
    }
}