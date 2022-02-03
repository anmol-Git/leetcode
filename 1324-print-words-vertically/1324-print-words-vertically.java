class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLen = getMax(words);
        
        for(int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(String word : words){
                if(word.length() > i) sb.append(word.charAt(i));
                else sb.append(' ');
            }
            
            list.add(trimRight(sb.toString()));
        }
        
        return list;
    }
    
    private String trimRight(String word) {
        int i = word.length();
        while(--i >= 0)
            if(word.charAt(i) != ' ') return word.substring(0,i+1);
        return "";
    }
    
    private int getMax(String[] arr) {
        int maxLen = 0;
        
        for(String word : arr) 
            if(word.length() > maxLen) maxLen =  word.length();
        return maxLen;
    }
}