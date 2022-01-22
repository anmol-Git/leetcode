class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp = a;
        int count = 1;
        while(a.length() < b.length()){
             a+=temp;
            count++;
        }
        
        if(isSubstring(a,b)) return count;
        
        if(isSubstring(a+temp,b)) return count+1;
        
        return -1;
    }
    
    boolean isSubstring(String a,String b){
       return  a.indexOf(b) !=-1;
    }
}