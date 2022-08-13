class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> list = new ArrayList<>();
        
        int wordLen = words[0].length();
        
        int strlen = words.length * wordLen;
        
        if(s.length() < strlen || words.length == 0) return list;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String str : words) {
            
            map.put(str, map.getOrDefault(str, 0) + 1);
            
        }
        
        for(int i = 0; i <= s.length() - strlen; i++) {
            
            String sub = s.substring(i, i + strlen);
            
            HashMap<String, Integer> tempMap = new HashMap<>();
            
            for(int j = 0; j < sub.length(); j += wordLen) {
                
                String tempWord = sub.substring(j, j + wordLen);
                
                tempMap.put(tempWord, tempMap.getOrDefault(tempWord, 0) + 1);
            }
            
            if(tempMap.equals(map)) list.add(i);
        }
        
        return list;
    }
       
}