class Solution {
    public String minWindow(String s, String t) {
        
        int slen = s.length();
        int tlen = t.length();
        if(slen < tlen) return "";
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < tlen; i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int dsct = tlen;
        int crct = 0;
        int i = -1;
        int j = -1;
        String ans = "";
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        
        while(true) {
            boolean aquire = false;
            boolean release = false;
            // aquire
            
            while(i < slen - 1 && crct < dsct) {
                i++;
                char ch = s.charAt(i);
                
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                
                if(map1.get(ch) <= map.getOrDefault(ch, 0)) crct++;
                
                aquire = true;
            }
            
            // collect and realease
            
            while(j < i && crct == dsct) {
                
                String temp = s.substring(j + 1, i + 1);
                
                if(ans.length() == 0 || temp.length() < ans.length()) {
                    ans = temp;
                }
                
                j++;
                
                char ch = s.charAt(j);
                
                if(map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }
                
                if(map1.getOrDefault(ch, 0) < map.getOrDefault(ch,0)) crct--;
                
                
                release = true;
            }
            
            if(!release && !aquire) break;
        }
        
        return ans;
    }
}