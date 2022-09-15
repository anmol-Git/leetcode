class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int len = changed.length;
        
        if((len&1) == 1) return new int[0];
                
        int[] res = new int[len/2];
        
        int[] freq = new int[100001];
        
        for(int val : changed)
            freq[val]++;
        
        
        int index=0;
        
        for(int i = 0;i < freq.length; i++){
            
            while(freq[i] > 0 && i * 2 < 100001 && freq[i*2] > 0){
                freq[i]--;
                freq[i*2]--;
                res[index++] = i;
            }
        }
        
        for(int i = 0; i < freq.length; i++){
            if(freq[i]!=0) return new int[0];
        }
        
        return res;
        

    }
}