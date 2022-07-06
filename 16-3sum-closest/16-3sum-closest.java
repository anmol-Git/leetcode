class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int minSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length-1;
            
            while(low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            
            int diff = sum - target;
                
            if(diff > 0) high--;
            else low++;
            
            diff = Math.abs(diff);
            if(diff < minDiff) {
                minDiff = diff;
                minSum = sum;
                }
            }
            
            if(minDiff == 0) break;
        }
        
        return minSum;
    }
}