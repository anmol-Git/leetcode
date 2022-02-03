class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        n--;
        while(n>0){
            String s = reverseAndInvert(sb.toString());
            sb.append('1');
            sb.append(s);
            n--;
        }
        return sb.charAt(k-1);
    }
    
    String reverseAndInvert(String s){
        // x = 1-x
        // x ^= 1
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        
        return sb.reverse().toString();
    }
}