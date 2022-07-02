class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int freq = 1;
        
        for(int i = 1;i < nums.length; i++){
            
            if(nums[i] != major) {
                freq--;
                if(freq == 0){
                    major = nums[i];
                    freq = 1;
                }
            } else {
                freq++;
            }
        }
        return major;
    }
}