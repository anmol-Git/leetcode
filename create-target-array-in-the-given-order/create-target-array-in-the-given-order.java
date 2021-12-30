class Solution {
public int[] createTargetArray(int[] nums, int[] index) {
        for(int i=0;i<nums.length;i++) {
            int idx = index[i];
            int value = nums[i];
            
            if(idx < i) {
                int k = i-1;
                int tmp = nums[i];
                
                while(k >= 0) {
                    nums[k+1] = nums[k];
                    if(k == idx) {
                        nums[k] = tmp;
                        break;
                    }
                    k--;
                }
            }
        }
        return nums;
    }
}