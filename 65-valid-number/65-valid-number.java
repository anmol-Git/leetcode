class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.trim().length() == 0) return false;
        
        s = s.trim();
        
        boolean numberSeen = false;
        boolean eSeen = false;
        boolean decimalSeen = false;
        
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            
            switch(curr) {
                case '.':
                    if(eSeen || decimalSeen) return false;
                    decimalSeen = true;
                    break;
                
                case 'e':
                case 'E':
                    if(eSeen || !numberSeen) return false;
                    eSeen = true;
                    numberSeen = false;
                    break;
                    
                case '+':
                case '-':
                    if(i!=0 && s.charAt(i-1) != 'e') return false;
                    numberSeen = false;
                    break;
                
                default:
                    if(!(curr >= '0' && curr <= '9')) return false;
                    numberSeen = true;
            }
        }
        return numberSeen;
    }
}