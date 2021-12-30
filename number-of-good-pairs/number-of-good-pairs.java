class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        HashMap<Integer,Integer>  map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> a : map.entrySet()){
            int temp = a.getValue()-1;
            count += (temp*(temp+1))/2;
        }
        
        return count;
    }
}