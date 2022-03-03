class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int count  = 0;
        Map<Integer,Integer> set = new HashMap<>();
        
        
        for(int i = 0;i<s.length();i++){
            int curr = s.charAt(i);
            
            if(set.containsKey(curr)) {
                i = set.get(curr)+1;
                set.clear();
                count = 0;
            }
            count++;
            set.put((int)s.charAt(i),i);
            maxLen = Math.max(maxLen,count);
            
        }
        
        return maxLen;
    }
}