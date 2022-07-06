class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int minSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length-1;
            
            while(low < high) {
             int sum = nums[i] + nums[low] + nums[high];
                
                if(Math.abs(target - sum) < Math.abs(diff)){
                    diff = target - sum;
                    minSum = sum;
                }
                if(sum < target) ++low;
                
                else --high;
            }
            
            if(diff == 0) break;
        }
        
        return minSum;
    }
}