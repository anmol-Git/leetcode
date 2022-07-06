class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int tempMax = 0;
        
        int minSum = Integer.MAX_VALUE;
        int tempMin = 0;
        
        int arraySum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            arraySum += nums[i];
            
            tempMax += nums[i];
            maxSum = maxSum < tempMax ? tempMax : maxSum;
            tempMax = tempMax < 0 ? 0 : tempMax;
            
            tempMin += nums[i];
            minSum = minSum > tempMin ? tempMin : minSum;
            tempMin = tempMin > 0 ? 0 : tempMin;
            
        } 
        
        if(arraySum == minSum) return maxSum;
        
        return Math.max(maxSum, arraySum - minSum);
    }
}