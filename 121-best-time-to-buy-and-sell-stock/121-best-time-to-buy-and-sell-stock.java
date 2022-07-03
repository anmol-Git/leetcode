class Solution {
    
    public int maxProfit(int[] prices) {
    
    int min = prices[0];
    int max = 0;
        
        for(int i = 1;i<prices.length;i++) {
            
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}