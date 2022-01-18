class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        sb.append(word1);
        int index = 0;
        for(int i = 1;i<sb.length() && index<word2.length();i++){
           if((1&i)==1){ 
            sb.insert(i,word2.charAt(index));
            index++;
          }
        }
        
        if(index<word2.length()) sb.append(word2.substring(index,word2.length()));
        
        return sb.toString();
    }
}