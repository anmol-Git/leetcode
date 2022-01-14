class Solution {
    public boolean judgeCircle(String moves) {
        int countx =0;
        int county = 0;
        
        for(int i = 0;i<moves.length();i++){
            int curr  = moves.charAt(i);
            
            if(curr == 'U') county++;
            
            else if(curr == 'D') county--;
            
            else if(curr == 'R') countx++;
            
            else countx--;
        }
        
        return countx == 0 && county == 0;
    }
}