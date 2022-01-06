class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length ==1) return true;
        int index = nums.length-1;
        
        for(int i = index;i>=0;i--){
            if(nums[i]+ i >=index) index = i;
        }
        return index == 0;
    }
}