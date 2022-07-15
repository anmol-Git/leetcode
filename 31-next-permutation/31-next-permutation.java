class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len == 1) return;
        
        int i = len - 2;
        
        while(i >= 0  && nums[i] >= nums[i + 1]) i--;
        
        if(i >= 0) {
            int j = len - 1;
            
            while(nums[j] <= nums[i]) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
        }
        
        //i + 1 to j reverse
        
        int start = i + 1;
        int end = len - 1;
        
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}