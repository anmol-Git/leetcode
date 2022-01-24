class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <2) return;
        int i = nums.length -2;
        
        while(i>=0 && nums[i+1] <= nums[i]){
            i--;
        }
        int j = nums.length-1;
        
        if(i>=0){
            while(j>i && nums[j] <= nums[i]){
            j--;
        }
        swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void reverse(int[] nums,int start){
        int end = nums.length-1;
        
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}