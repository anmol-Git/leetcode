class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXOR(nums, 0, 0);
    }
    
    int subsetXOR(int[] nums, int index, int res) {
        
        if(index >= nums.length) {
            return res;
        }
        
        return subsetXOR(nums,index + 1, res^nums[index]) + subsetXOR(nums, index + 1, res);
    }
}