class Solution {
    public String longestPrefix(String s) {
           
        int len = s.length();
        long mod = 1000000007;
        long p = 17;
        long pow = 1;
        long ph = 0;
        long sh = 0;
        int ans = 0;
        
        
        if(len == 1) return "";
        
        for(int i = 0; i < len - 1; i++) {
            
            ph = ((ph * p) % mod + (s.charAt(i) - 'a' + 1)) % mod;
            sh = (sh + ((s.charAt(len - i - 1) - 'a' + 1) * pow) % mod) % mod;
            
           pow = (pow * p) % mod;
            
           if(ph == sh) ans = i + 1;  
        } 
        
        return s.substring(0,ans);
    }
}