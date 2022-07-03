class Solution {
    
    public int maxProfit(int[] prices) {
    
    int min = prices[0];
    int max = 0;
        
        for(int i = 1;i<prices.length;i++) {
            
            if(prices[i]-min > max) max = prices[i] - min;
            if(min > prices[i]) min = prices[i];
        }
        return max;
    }
}