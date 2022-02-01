class Solution {
    static int mod = 1000000007;
    public int countHomogenous(String s) {
        int ans = 0;
        int start = 0;
        for(int i = 1;i<s.length();i++){
            
            if(s.charAt(i-1) != s.charAt(i)){
                int count = i-start;
                ans = (ans + combination(count))%mod;
                start = i;
            }
        }
         ans = (ans + combination(s.length()-start))%mod;
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