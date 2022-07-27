class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int[] arr = new int[nums.length];
        int even = 0;
        int odd = 1;
        
        for(int i = 0; i < nums.length; i++) {
            
            if((nums[i]&1) == 0) {
                arr[even] = nums[i];
                even += 2;
            }
            else {   
                arr[odd] = nums[i];
                odd += 2;
            }   
        }
        return arr;
    }
}