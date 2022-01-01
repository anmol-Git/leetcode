class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i = 0;i<nums.length;i++){
            int  digit = (int)Math.log10(nums[i])+1;
            
            if((digit&1) == 0) count++;
        }
        return count;
    }
}