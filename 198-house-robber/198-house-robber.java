class Solution {
    public int rob(int[] nums) {
        int choiceOne  = 0;
        int choiceTwo  = 0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(nums[i]+choiceOne,choiceTwo);
            choiceOne = choiceTwo;
            choiceTwo = temp;
        }
        return choiceTwo;
    }
}