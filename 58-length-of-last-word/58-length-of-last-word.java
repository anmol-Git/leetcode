class Solution {
    public int lengthOfLastWord(String s) {
       int n = s.length();
       int len = 0;
        while(n>0){
            n--;
            if(s.charAt(n) != ' ') {
                len++;
            }else if(len > 0) return len;
            
        }
        return len;
    }
}