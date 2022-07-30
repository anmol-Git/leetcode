class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
     
        List<String> list = new ArrayList<>();
        
        int[] parr = new int[26];
        
        for(String word : words2) {
            
             int[] warr = new int[26];
            
            for(int i = 0; i < word.length(); i++) warr[word.charAt(i) - 'a']++;
            
            for(int i = 0; i < 26; i++) {
                
                parr[i] = Math.max(parr[i], warr[i]);
                
            }
            
        }
        
        for(String word : words1) {
            
            if(isSubset(word, words2, parr)) list.add(word);
        }
        
        return list;
    }
    
    private boolean isSubset(String pattern, String[] words, int[] freq) {
        // make freq map for character
        int[] parr = new int[26];
        
        for(int i = 0; i < pattern.length(); i++) parr[pattern.charAt(i) - 'a']++;
        
        for(int i = 0; i < 26; i++) {
            
            if(parr[i] < freq[i]) return false;
            
        }
        
        
        return true;
    }
}