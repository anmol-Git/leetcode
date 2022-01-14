class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        
        int firstHalf = 0;
        int secondHalf = 0;
        
        for(int i =0;i<n/2;i++){
            char curr = s.charAt(i);
            char curr2 = s.charAt(i+n/2);
            
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') firstHalf++;
            if(curr2 == 'a' || curr2 == 'e' || curr2 == 'i' || curr2 == 'o' || curr2 == 'u') secondHalf++;
            
        }
        
        return firstHalf == secondHalf;
    }
}