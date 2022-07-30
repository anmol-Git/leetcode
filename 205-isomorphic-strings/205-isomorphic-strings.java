class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(!map.containsKey(c1)) map.put(c1,  c2);
            if(!map2.containsKey(c2)) map2.put(c2, c1);
            
            if(map.get(c1) != c2 || map2.get(c2) != c1) return false;
        }
        
        return true;
    }
}