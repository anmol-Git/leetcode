class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int len = nums.length;
        int count = 0;
        for(int i = len - 1; i >= 2; i--) {
            int j = 0;
            int k = i - 1;
            
            while(j < k) {
                
                if(nums[i] < nums[j] + nums[k]) {
                    
                    count += k - j;
                    k--;
                    
                }
                else j++;
            }
        }
        
        return count;
    }
}