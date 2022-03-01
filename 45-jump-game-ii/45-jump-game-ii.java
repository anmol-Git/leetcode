class Solution {
    public int jump(int[] nums) {
        int i = 0;
        int count = 0;
        if(nums.length == 1) return 0;
        while(i<nums.length) {
            
            if(nums[i] + i >= nums.length-1) return count + 1;
            
            int range = nums[i];
            
            int max = -1;
            int maxInd = i;
            for(int j = i; j <= i + range; j++) {
                if(nums[j] + j > max) {
                    max = nums[j] + j;
                    maxInd = j;
                }
            }
            if(maxInd == i){
               i = nums[i] + i;
            }
            else{
                i = maxInd;
            }
            
            count++;
            
            
        }
        return count;
    }
}