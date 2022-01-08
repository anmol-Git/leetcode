class Solution {
    public int firstMissingPositive(int[] nums) {
      cyclic(nums);
    for(int i =0;i<nums.length;i++) if(nums[i] != i+1) return i+1;
    return nums.length+1;
    }
    
    void cyclic(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] >0 && nums[i]<nums.length && nums[i] != nums[correct]) swap(nums,i,correct);
            else i++;
        }
    }
    
    void swap(int [] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}