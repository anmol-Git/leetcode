class Solution {
    public int firstUniqChar(String s) {
        
        int[] ch = new int[26];
        
        for(char c : s.toCharArray()) ch[c - 'a']++;
        
        for(int i = 0; i < s.length(); i++) {
            
            if(ch[s.charAt(i) - 'a'] == 1) return i;
            
        }
        
        return -1;
    }
}