class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i =0;i<s.length();i++){
            int ch = s.charAt(i);
            
            if(ch <=90 && ch>=65){
                ch+=32;
                sb.deleteCharAt(i);
                sb.insert(i,(char)ch);
            }
        }
        return sb.toString();
    }
}