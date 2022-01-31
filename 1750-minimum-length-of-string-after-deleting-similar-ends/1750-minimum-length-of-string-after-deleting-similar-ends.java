class Solution {
    public int minimumLength(String s) {
        if(s.length() <2) return s.length();
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            char start = s.charAt(i);
            char end = s.charAt(j);
            if(s.charAt(i) != s.charAt(j)) return j-i+1;
            
            while(i<=j && s.charAt(i) == start) i++;
            while(j>=i && s.charAt(j) == end) j--;
        }
        if(i == j) return 1;
        return 0;
    }
    
}