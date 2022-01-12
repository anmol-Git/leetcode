class Solution {
    public boolean isGoodArray(int[] nums) {
       int a = nums[0];
        
        for(int i =0;i<nums.length;i++){
            a = gcd(nums[i],a);
        }
        return a == 1;
    }
    
    int gcd(int n1,int n2){
    
        if(n1==0) return n2;
        
       return gcd(n2%n1,n1);
    }
}