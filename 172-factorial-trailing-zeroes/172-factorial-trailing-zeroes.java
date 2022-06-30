class Solution {
    public int trailingZeroes(int n) {
        if(n<0) return -1;
        
        int count = 0;
        
        
        
        for(int i = 1; n/(int)Math.pow(5,i) >= 1; i++){
            
            count += n/(int)Math.pow(5,i);
        }
        return count;
    }
}