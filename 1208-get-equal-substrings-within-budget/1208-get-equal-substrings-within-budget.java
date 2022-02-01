class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        
        int max = 0;
        
        for(int i =0;i<n;i++){
            int count = 0;
            int cost = arr[i];
            int index = i;
            while(index < n && cost <= maxCost){
              count++;
              index++;
             if(index < n) cost += arr[index]; 
            }
            max = Math.max(max,count);
        }
        
        return max;
    }
}