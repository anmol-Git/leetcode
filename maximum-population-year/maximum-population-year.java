class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int ind = 0;
        for(int i =1950;i<=2050;i++){
            int count =0;
            for(int j =0;j<logs.length;j++){
                if(logs[j][0] <=i && logs[j][1] > i) count++;
            }
            if(max<count) {
                max = count;
                ind = i;
            }
        }
        return ind;
    }
}