class Solution {
    public int search(int[] nums, int target) {        
        int peak = findPeakElement(nums);

        if(peak == -1) return binarySearch(nums,target,0,nums.length-1);
        
        int firstHalf =  binarySearch(nums,target,0,peak);
        if(firstHalf  == -1) {
            return  binarySearch(nums,target,peak+1,nums.length-1);
        }
        return firstHalf;
    }
    
    int binarySearch(int[] nums, int target, int start, int end) {
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target) return mid;
            
            else if(nums[mid] > target) end = mid - 1;
            
            else start = mid + 1;
        }
        
        return -1;
    }
    
    public int findPeakElement(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        
        if(end == 0) return 0;
        
        while(start <= end) {
           
            int mid = start + (end - start)/2;
            
            if(mid == 0 && nums[mid] > nums[mid + 1]) return mid;
            
            else if(mid == nums.length-1 && nums[mid] > nums[mid - 1]) return mid;
            
            else if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;
            
            else if (nums[0] > nums[mid]) end = mid - 1;
            
            else start = mid + 1;
        }
        
        return -1;
    }
}