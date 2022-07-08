class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        
        long start = 0;
        long end = x;
        
        while(start <= end) {
            long mid = start + (end - start)/2;
            
            if(mid * mid > x) end = mid - 1;
            else start = mid + 1;
        }
        return (int)end;
    }
}