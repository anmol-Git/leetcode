public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int i = 32;
        int ans = 0;
        
        while(i != 0) {
            
           int lastDigit = n & 1;
            
            n >>= 1;
            if(lastDigit != 0) {
                
                lastDigit = 1;
                
            }
            
            ans <<= 1;
            
            ans += lastDigit;
            
            i--;
        }
        
        return ans;
        
    }
}