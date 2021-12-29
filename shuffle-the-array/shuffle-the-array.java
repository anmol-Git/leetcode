class Solution {
    public int[] shuffle(int[] nums, int n) {
        int even = 0;
        int odd = 1;
        int i =0;
        int[] ans = new int[2*n];
        while(i < n){
            ans[even] = nums[i];
            ans[odd] = nums[i+n];
            even+=2;
            odd+=2;
            i++;
        }
        return ans;
    }
}