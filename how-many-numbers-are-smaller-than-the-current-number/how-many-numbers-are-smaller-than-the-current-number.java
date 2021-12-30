class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int [] a = new int[501];
        for(int i =0;i<nums.length;i++){
          a[nums[i]]++;
        }
        
        for(int i =0;i<a.length;i++){
           count+=a[i];
            a[i]=count;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0) continue;
            else nums[i] = a[nums[i]-1];
        }
        return nums;
    }
}