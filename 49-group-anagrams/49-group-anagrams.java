class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        
    HashMap<HashMap<Character,Integer>, ArrayList<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++) {
            
            HashMap<Character,Integer> fmap = new HashMap<>();
            
            for(int j = 0; j < strs[i].length(); j++) {
                
                char ch = strs[i].charAt(j);
                
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
                
            }
            
            if(map.containsKey(fmap)) {
                ArrayList<String> temp = map.get(fmap);
                
                temp.add(strs[i]);
                
                map.put(fmap,temp);
            }
            else {
                ArrayList<String> temp = new ArrayList<>();
                
                temp.add(strs[i]);
                
                map.put(fmap,temp);
                
            }
        }
        
for(Map.Entry<HashMap<Character,Integer>, ArrayList<String>> a : map.entrySet())         {
            list.add(a.getValue());   
        }
        
        return list;
    }
}