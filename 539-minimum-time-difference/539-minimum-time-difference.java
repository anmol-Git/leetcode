class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean [] arr = new boolean[24 * 60];
        
        for(String time : timePoints){
            String[] st = time.split(":");
            int hour = Integer.parseInt(st[0]);
            int min = Integer.parseInt(st[1]);
            
            if(arr[hour*60 + min]) return 0;
            arr[hour*60 + min] = true;
        }
        
        int first = -1;
        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]){
                if(first == -1){
                    first = i;
                    prev = i;
                }else{
                    minDiff = Math.min(minDiff,i-prev);
                    prev=i;
                }
            }
        }
        minDiff = Math.min(minDiff,first  + 1440 - prev);
        return minDiff;
    }
}