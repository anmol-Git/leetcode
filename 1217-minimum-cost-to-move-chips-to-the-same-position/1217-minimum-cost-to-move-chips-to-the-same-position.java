class Solution {
    public int minCostToMoveChips(int[] nums) {
        int even = 0;
        int odd = 0;
        
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1) ==0){
                even++;
            }else{
                odd++;
            }
        }
        return even>odd ? odd : even;
    }
}