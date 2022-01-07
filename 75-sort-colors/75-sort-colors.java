class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1) return;
        int start = 0;
        int end = nums.length-1;
        int i =0;
        while(i<=end){
            if(nums[i] == 0){
                swap(nums,i,start);
                start++;
            }else if(nums[i] == 2){
                swap(nums,i,end);
                end--;
                i--;
            }
            i++;
        }
    }
    
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}