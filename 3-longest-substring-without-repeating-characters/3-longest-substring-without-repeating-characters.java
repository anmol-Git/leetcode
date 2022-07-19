class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        
        
        int i = 0;
        int j = 0;
        
        while(j < s.length()) {
            
            char ch = s.charAt(j);
            
            map.put(ch , map.getOrDefault(ch, 0) + 1);
            
            if(map.size() == j - i + 1) {
                 maxLen = Math.max(maxLen, j - i + 1);
                 j++;
            }
            
            
            else if(map.size() < j - i + 1) { 
                
                while(map.size() < j - i + 1) {
                    char temp = s.charAt(i);
                    int get = map.get(temp);
                    
                    if(get == 1) map.remove(temp);
                    else map.put(temp,get-1);
                    i++;
                }
                 j++;
            }
          
        }
        
        return maxLen;
    }
}