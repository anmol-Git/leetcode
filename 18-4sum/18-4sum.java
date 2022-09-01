class Solution {
     public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 4) return list;
        Arrays.sort(nums);
        for(int k=0;k<nums.length-3;k++){
            if(k>0 && nums[k-1] == nums[k]) continue;
            for(int i =k+1;i<nums.length-2;i++){
                if(i>k+1 && nums[i-1] == nums[i]) continue;
                int start = i+1;
                int end = nums.length-1;
                while(start<end){

                    long sum = nums[start];
                    boolean isInf = false;
                    sum += nums[end];
                    if (sum > Integer.MAX_VALUE) isInf = true;
                    sum += nums[k];
                    if (sum > Integer.MAX_VALUE) isInf = true;
                    sum += nums[i];
                    if (sum > Integer.MAX_VALUE)  isInf = true;
                    if(!isInf && sum == target){
                        list.add(Arrays.asList(nums[k],nums[i],nums[start],nums[end]));
                        while(start<end && nums[start+1] == nums[start]) start++;
                        while(start<end && nums[end-1] == nums[end]) end--;

                        start++;
                        end--;
                    }else if(sum > target) end--;
                    else start++;
                }
            }
        }
        return list;

    }
}