class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            char curr = s.charAt(i);
            
            
            if(curr == '#'){
                String num = s.substring(i-2,i);
                sb.append((char)('a'+ Integer.parseInt(num)-1));
                i-=2;
            }
            
            else{
                sb.append((char)('a'+ Integer.parseInt(String.valueOf(curr))-1));
            }
            
            
            i--;
        }
        
       return sb.reverse().toString();
    }
}