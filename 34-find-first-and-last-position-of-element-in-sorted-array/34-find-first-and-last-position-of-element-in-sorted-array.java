class Solution {
    public int[] searchRange(int[] nums, int target) {
          
          int len = nums.length;
            
          if(len == 0) return new int[]{-1,-1}; 
        
          int startIndex = 0;
          int lastIndex = 0;
          
           if(target < nums[0]) startIndex = -1;  
          else startIndex = startIndex(nums, target, 0, len - 1);
          
          if(target > nums[len - 1]) lastIndex = -1;
          else lastIndex = lastIndex(nums, target, 0, len - 1);
        
          return new int[]{startIndex,lastIndex};
    }
    
    int lastIndex(int[] nums,int target,int start,int end) {
        
        while(start <= end) {
            
            int mid = start + (end - start)/2;
            
            if(nums[mid] <= target) start = mid + 1;
            
            else end = mid - 1;
        }
        
        if(end < 0 || end >= nums.length || nums[end] != target) end = -1;
        
        return end;
    }
    
    int startIndex(int[] nums,int target,int start,int end) {
        
        while(start <= end) {
            
            int mid = start + (end - start)/2;
            
            if(nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
        }
        
         if(start < 0 || start >= nums.length || nums[start] != target) start = -1;
        return start;
    }
}