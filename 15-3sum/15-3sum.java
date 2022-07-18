class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>  list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            
            int target = - nums[i];
            
            int start = i + 1;
            int end = nums.length - 1;
            
            while(start < end) {
                
                int curr = nums[start] + nums[end];
                
                if(curr == target) {
                    list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    while(start < end && nums[start] == nums[start + 1]) start++;
                    while(start < end && nums[end - 1] == nums[end]) end--;
                    
                    start++;
                    end--;
                }
                else if(curr > target) end--;
                else start++;
                
            }
        }
        
        return list;
    }
}