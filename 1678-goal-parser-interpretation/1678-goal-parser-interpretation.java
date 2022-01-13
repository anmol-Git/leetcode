class Solution {
    public String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i< s.length();i++){
            char curr = s.charAt(i);
            if(curr == 'G') sb.append('G');
            else if(i<s.length()-1 && s.charAt(i+1) == 'a'){
                sb.append("al");
                i+=3;
            }else  if(i<s.length()-1 && s.charAt(i+1) == ')'){
                sb.append('o');
                i+=1;
            } 
        }
        return sb.toString();
    }
}