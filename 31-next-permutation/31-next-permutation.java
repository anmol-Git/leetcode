class Solution {
    public void nextPermutation(int[] nums) {
        
        int len = nums.length;
        
        int currentIndex = -1;
        
        for(int i = len - 2; i >= 0; i--) {
            
            if(nums[i] < nums[i + 1]) {
                
                currentIndex = i;
                break;
            }
        }
        
        if(currentIndex < 0) {
            Arrays.sort(nums);
            return;
        }
        
        for(int i = len - 1; i >= 0; i--) {
            
            if(nums[i] > nums[currentIndex]) {
                
                swap(nums, i, currentIndex);
                
                reverse(nums, currentIndex + 1, len - 1);
                
                break;
            }
        }
    }
    
    static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    static void swap(int[] nums, int start, int end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
    }
}