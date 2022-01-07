class Solution {
    public void sortColors(int[] nums) {
        int ones = 0;
        int twoes = 0;
        int zeroes = 0;
        int i = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i] == 0) zeroes++;
            else if(nums[i] == 2) twoes++;
            else ones++;
        }
        i = 0;
        while(zeroes>0){
            nums[i++] = 0; 
            zeroes--;
        }
        
        while(ones>0){
        nums[i++] = 1;
            ones--;
        }
        
        while(twoes>0){
            nums[i++] = 2;
            twoes--;
        }
    }
}