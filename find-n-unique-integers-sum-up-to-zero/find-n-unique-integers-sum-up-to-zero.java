class Solution {
    public int[] sumZero(int n) {
        if(n<2) return new int[]{0};
        int [] ans = new int[n];
        int counter =1;
          
            for(int i =0;i<n-1;i+=2){
                ans[i] = counter;
                ans[i+1] = -counter;
                counter++;
            }
        return ans;
    }
}