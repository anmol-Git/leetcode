class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
        
       Set<String> set = new HashSet<>();
        
        for(int i = 0; i < words.length; i++) {
            
            StringBuffer sb = new StringBuffer();
            
            String curr = words[i];
            
            for(char c : curr.toCharArray()) {
                
                sb.append(morse[c - 'a']);
                
            }
            
            set.add(sb.toString());
        }
        
        return set.size();
    }
}