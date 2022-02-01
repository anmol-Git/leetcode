class Solution {
    static int mod = 1000000007;
    public int numSub(String s) {
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            
            if(s.charAt(i) == '1'){
                int count = 0;
                while(i<s.length() && s.charAt(i) == '1'){
                    count++;
                    i++;
                }
                ans = (ans + combination(count))%mod;
                i--;
            }
        }
        return ans;
    }
    
    int combination(int count){
        if(count == 1) return 1;
        if(count == 2) return 3;
        int ans = 0;
        while(count>0){
            ans = (ans + count)%mod;
            count--;
        }
        return ans;
    }
}