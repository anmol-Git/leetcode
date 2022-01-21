class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        int i1 = 0;
        int i2 = 0;
        int nextWord = 0;
        if(s1.length() < s2.length()){
            String temp = s1;
            s1 =s2;
            s2 = temp;
        }
        
         int n1 = s1.length();
         int n2 = s2.length();
        
        //smaller will always be s2
        
        while(i1<n1 && i2<n2 && s1.charAt(i1) == s2.charAt(i2)){
            if(s1.charAt(i1) == ' ') nextWord = i2+1;
            i1++;
            i2++;
        }
        
       if(i2 == n2 && (i1<n1 && s1.charAt(i1) == ' ')) return true;
    
        i2 = nextWord;
        i1 = n1 - (n2 - nextWord);
        
        if(i1>0 && s1.charAt(i1-1) != ' ') return false;
            
        while(i1<n1 && i2<n2 && s1.charAt(i1) == s2.charAt(i2)){
            i1++;
            i2++;
        }
        
        return i1==n1 && i2==n2;
        
    }
}