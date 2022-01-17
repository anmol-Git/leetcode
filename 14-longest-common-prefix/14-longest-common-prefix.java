class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s =strs[0];
        
        for(int i = 1; i < strs.length;i++){
             int j = 0;
                for( j = 0;j<s.length() && j<strs[i].length();j++){
                    if(s.charAt(j) != strs[i].charAt(j)) break; 
                }
            if(j == 0) return "";
            s = strs[i].substring(0,j);
        }
        return s;
    }
}