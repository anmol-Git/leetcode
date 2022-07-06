class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] Lmax = new int[len];
        int[] Rmax = new int[len];
        
        Lmax[0] = height[0];
        Rmax[len - 1] = height[len - 1];
        
        for (int i = 1; i < len; i++) {
            Lmax[i] = Math.max(Lmax[i-1], height[i]);
            Rmax[len - i - 1] = Math.max(Rmax[len-i], height[len-i-1]);
        }
        
        int totalWater = 0;
        
        for(int i = 0; i < len ; i++) {
            totalWater += Math.min(Lmax[i],Rmax[i]) - height[i];    
        }
        
        return totalWater;
    }
}