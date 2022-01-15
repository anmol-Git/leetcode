class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        
        while(start<=end){
            long mid = start + (end - start)/2;
            if(mid * mid > x) end = (int)mid-1;
            else start = (int)mid+1;
        }
        
    return end;
    }
}