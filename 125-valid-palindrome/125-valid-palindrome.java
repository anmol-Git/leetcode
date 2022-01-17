class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            if((curr >='a' && curr <='z') || (curr <='9' && curr >='0')) sb.append(curr);
        }
        
        s = sb.toString();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false; 
        }
        return true;
    }
}