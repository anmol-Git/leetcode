class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        cyclic(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]-1 != i) list.add(nums[i]);
        }
        return list;
    }
    
    void cyclic(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct] != nums[i]) swap(nums,i,correct);
            else i++;
        }
    }
    
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}