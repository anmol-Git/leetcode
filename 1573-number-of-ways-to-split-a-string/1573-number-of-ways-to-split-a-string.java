class Solution {
    public int numWays(String s) {
        long one = 0;
        long n = s.length();
        long mod = 1000000007;
        
        for(char c : s.toCharArray()) if(c == '1') one++;
        
        if(one == 0) return  (int)((((n-1) * (n-2))/2)%mod);
        
        if(one%3 !=0) return 0;
        
        one = one/3;
        long firstCut = 0;
        long secondCut = 0;
        long count = 0;
        
        for(int i = 0; i < n; i++){
             if(s.charAt(i) == '1') count++;
             
            if(count == one) firstCut++;
            if(count == 2*one) secondCut++; 
        }
        return (int)((firstCut * secondCut)%mod);
    }
}