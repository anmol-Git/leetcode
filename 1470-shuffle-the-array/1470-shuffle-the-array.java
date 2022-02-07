class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        for(int i =n;i<nums.length;i++){
            nums[i] =  nums[i] + nums[i-n]*1030;
        }
        
        int index=0;
        for(int i = n;i<nums.length;i++){
            nums[index] = nums[i]/1030;
            nums[index+1] = nums[i]%1030;
            index+=2;
        }
        return nums;
    }
}