class Solution {
    public boolean canJump(int[] nums) {
    
        int i = 0;
        int reach = 0;
        
        while(i<nums.length) {
            if(reach < i) return false;
            reach = Math.max(reach,i+nums[i]);
            i++;
        }
        return true;
    }
}