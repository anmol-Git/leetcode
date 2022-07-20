class Solution {
    public int singleNumber(int[] nums) {
        
        int res = 0;
        
        int[] arr = new int[32];
        
        for(int i = 0; i < 32; i++) {
           
            int count = 0;
            
            for(int j = 0; j < nums.length; j++) {
                
                if((nums[j]&(1<<i)) != 0) count++;
                
            }
            
            if(count%3 != 0) {
                res |= 1 << i;
            }
        }
        
        return res;
    }
}