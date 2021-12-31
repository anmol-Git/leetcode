class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currSum = 0;
        for(int i =0;i<gain.length;i++){
            currSum +=gain[i];
            max = Math.max(currSum,max);
        }
        return max;
    }
}