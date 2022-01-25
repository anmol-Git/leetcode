class Solution {
    public boolean canTransform(String start, String end) {
        
        if (start.replace("X", "").length() != end.replace("X", "").length()) return false;

        int j = 0;
        
        for(int i =0;i<start.length();i++){
            if(start.charAt(i) == 'L'){
                
                while(j<end.length() && end.charAt(j)!='L') j++;
                
                if(j>i) return false;
                j++;
            }
            
            if(start.charAt(i) == 'R'){
                
                while(j<end.length() && end.charAt(j) != 'R') j++;
                
                if(j<i) return false;
                j++;
            }
        }
        return true;
    }
}