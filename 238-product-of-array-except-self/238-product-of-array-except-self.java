class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] out = new int[len];
        
        out[0] = nums[0];
        for(int i =1;i<len-1;i++){
            out[i] = out[i-1] * nums[i];
        }
        int post = nums[len-1];
        out[len-1] = out[len-2];
        for(int i =len-2;i>=1;i--){
            out[i] = out[i-1] * post;
            post*=nums[i];
        }
        out[0] = post;
        return out;
    }
}