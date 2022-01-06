class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length == 1) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}