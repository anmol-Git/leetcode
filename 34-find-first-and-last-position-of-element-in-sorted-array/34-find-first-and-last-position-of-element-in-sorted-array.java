class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<1) return new int[]{-1,-1};
        int first = firstPosition(nums,target);
        int second = secondPosition(nums,target);
        if(first >= nums.length || first == -1 || nums[first] != target)  return new int[]{-1,-1};         
        return new int[]{first,second};
    }
    
    int firstPosition(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target) end = mid-1;
            else  start = mid+1;
        }
        return start;
    }
    
     int secondPosition(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
             int mid = start + (end - start)/2;
            if(nums[mid] > target) end = mid-1;
            else  start = mid+1;
        }
        return end;
    }
}