class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int start = 0;
        int end = len - 1;
        int maxLeft = height[start];
        int maxRight = height[end];
        int totalWater = 0;
        
        while(start < end) {
            if(maxLeft < maxRight) {
                start++;
                maxLeft = Math.max(maxLeft, height[start]);
                totalWater += maxLeft - height[start];
            }
            else {
                end--;
                maxRight = Math.max(maxRight, height[end]);
                totalWater += maxRight - height[end];
            }
        }
        return totalWater;
    }
}