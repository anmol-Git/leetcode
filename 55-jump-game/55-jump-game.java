class Solution {
    public boolean canJump(int[] nums) {
        int i = nums.length-1;
        
        while(i>0) {
            int j = i-1;
            while(j>=0) {
                if(j+nums[j] >= i) {
                    i = j;
                    break;
                }
                j--;
            }
            if(j == -1) return false;
        }
        return true;
    }
}