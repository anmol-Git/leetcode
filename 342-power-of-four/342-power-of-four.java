class Solution {
    public boolean isPowerOfFour(int num) {
        int n = num;
        if(n < 4 && n != 1) return false;
        
        int count = 0;
       
        while(n > 0) {
            n = (n&(n - 1));
            count++;
        }
        
        if(count != 1) return false;
        
        count = 0;
        while(count < 32) {
           if((num&1) == 1) break;
            count++;
            num >>= 1;
        }
       
        return (count&1) == 0;
    }
}