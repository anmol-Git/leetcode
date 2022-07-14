class Solution {
    public String reverseWords(String s) {
        
        StringBuffer sb = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        s = s.trim();
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }
            else if(sb.length() == 0 || s.charAt(i - 1) != ' ' ) {
                sb.append(' ');
                sb.append(temp.reverse().toString());
                temp.delete(0, temp.length());
            }
        }
        
        if(s.charAt(s.length() - 1) != ' '){
        sb.append(' ');
        sb.append(temp.reverse().toString());
     }
        return sb.reverse().toString().trim();
    }
}