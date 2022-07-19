class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        List<Character> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            while(list.size() > 0 && list.contains(ch)) list.remove(0);
            
            list.add(ch);
            
            maxLen = Math.max(maxLen, list.size());
        }
        
        return maxLen;
    }
}