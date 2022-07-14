class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = strs[0];
        
        for(int i = 1; i < strs.length; i++) {
            
            String curr = strs[i];
            int index = 0;
            
            while(index < s.length() && index < curr.length()) {
                
                if(s.charAt(index) ==  curr.charAt(index)) index++;
                else break;
            
            }
            
          s = s.substring(0,index);   
        }
        
        return s;
    }
}