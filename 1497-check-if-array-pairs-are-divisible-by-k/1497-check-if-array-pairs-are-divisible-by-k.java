class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            int rem =  (arr[i]%k + k)%k;
            
            map.put(rem ,map.getOrDefault(rem, 0) + 1);
            
        }
        
        for(int i = 0; i < arr.length; i++) {
            
            int rem =  (arr[i]%k + k)%k;
            int get = map.get(rem);

            if(rem == 0) {
                
                if((get&1) == 1) return false;
            
            }
            else if(2 * rem == k) {
            
                if((get&1) == 1) return false;
            
            }
            else {
                
                int oGet = map.getOrDefault(k - rem, 0);
                if(oGet != get) return false;
            }
        }
        return true;
    }
}