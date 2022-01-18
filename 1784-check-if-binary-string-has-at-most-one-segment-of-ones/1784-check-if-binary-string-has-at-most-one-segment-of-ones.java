class Solution {
    public boolean checkOnesSegment(String s) {
        boolean contigous = true;
        for(char c  : s.toCharArray()) {
            if(c == '0') contigous =  false;
            if(!contigous  && c =='1') return false;
        }
        return true;
    }
}