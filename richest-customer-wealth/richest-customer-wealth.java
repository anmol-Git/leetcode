class Solution {
    public int maximumWealth(int[][] nums) {
        int max = 0;
        
        for(int [] a : nums){
            int sum = 0;
            
            for(int i : a){
                sum+=i;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}