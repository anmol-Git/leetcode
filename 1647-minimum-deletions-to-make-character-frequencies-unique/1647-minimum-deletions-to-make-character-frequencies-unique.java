class Solution {
    
    
    public int minDeletions(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        }
        
        List<Integer> list = new ArrayList<>();
        
         for(Map.Entry<Character,Integer> a : map.entrySet()) {
             
             int currFreq = a.getValue();
             
             if(list.contains(currFreq)) {
               
                 while(currFreq > 0 && list.contains(currFreq)) {
                     count++;
                     currFreq--;
                     
                 }
                 
                  map.put(a.getKey(), currFreq);
                 
             }
             
                 list.add(currFreq);
             
             
         }
        
        return count;
    }
}