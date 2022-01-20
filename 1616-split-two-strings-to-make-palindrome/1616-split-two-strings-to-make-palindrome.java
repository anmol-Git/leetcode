class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    
    boolean check(String a,String b){
        int start = 0;
        int end = a.length()-1;
        
        while(start<end && a.charAt(start) == b.charAt(end)){
            start++;
            end--;
        }
        if(start>=end) return true;
        
return isPalindrome(a.substring(start,end+1)) || isPalindrome(b.substring(start,end+1));
    }
    
    boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
       while(start<=end){
            if(s.charAt(start) != s.charAt(end)) return false;
           start++;
           end--;
        }
        
        return true;
    }
}