class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        if(s.length() == 0) return 0;
        
        int sign = isCharPresent(s,'-') ? -1 : 1;
        int ans = 0;
        int i = 0;
        
        if(sign == - 1 || isCharPresent(s,'+')) i = 1;
        
        
        for(; i < s.length() && isDigit(s.charAt(i)); i++) {
            
            long temp = (long)ans*10 + (s.charAt(i) - '0');
            
            if(temp > Integer.MAX_VALUE) return sign == -1 ?    
                Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            ans = (int)temp;
        }
        
        return sign * ans;
    }
    
    boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
    
    boolean isCharPresent(String s, char ch) {
        return (s.length() > 0 && s.charAt(0) == ch);
    }
}