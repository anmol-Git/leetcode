class Solution {
    public int missingNumber(int[] nums) {
        
        int len = nums.length;
        
        long idealSum = (len * (len+1))/2;
        
        long actualSum = 0;
        
        for(int i : nums) {
            actualSum += i;
        }
        
        return (int)(idealSum - actualSum);
    }
}