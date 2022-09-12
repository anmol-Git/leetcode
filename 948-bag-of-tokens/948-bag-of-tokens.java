class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
       Arrays.sort(tokens);
        
        int start = 0;
        int end = tokens.length - 1;
        
        int max = 0;
        int score = 0;
        
        while(start <= end) {
            
            if(power >= tokens[start]) {
                
                power -= tokens[start];
                score++;
                start++;
            }
            else if(score > 0){
                 
                power += tokens[end];
                score--;
                end--; 
            }
            else start++;
            
            max = Math.max(max, score);
        }
        
        return max;
    }
}