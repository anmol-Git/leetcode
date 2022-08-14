class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new HashSet<>();
        
        boolean ispresent = false;
        
        for(String s : wordList) {
            
            set.add(s);
            
            if(s.equals(endWord)) ispresent = true;
            
        }
        
        if(!ispresent) return 0;
        
        
        Queue<String> q = new LinkedList<>();
        
        q.add(beginWord);
        
        int depth = 0;
        
        while(!q.isEmpty()) {
            
            depth += 1;
            
            int qsize = q.size();
            
            while(qsize-- > 0) {
                
                String curr = q.remove();
                
                
                
                for(int i = 0; i < curr.length(); i++) {
                    
                    char[] ch = curr.toCharArray();
                    
                    
                    for(char c = 'a'; c <= 'z'; c++) {
                        
                        
                        ch[i] = c;
                        
                        String temp = new String(ch);
                        
                        if(temp.equals(curr)) continue;
                        
                        if(temp.equals(endWord)) return depth + 1;
                        
                        if(set.contains(temp)) {
                            
                            q.add(temp);
                            set.remove(temp);
                        }
                        
                    }
                    
                }
                
            }
        }
        
        return 0;
    }
}