class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        
        char[] ssb = s.toCharArray();
        
        int left = 0;
        int right = removable.length-1;
        
        while(left<=right){
            int mid = left +(right - left)/2;
            
            for(int i =0;i<=mid;i++) ssb[removable[i]] = '4';
            
            if(isSubsequence(ssb,p)) left = mid+1;
            else{
              for(int i =0;i<=mid;i++)
                ssb[removable[i]] = s.charAt(removable[i]);
                right = mid-1;
            }
        }
        
        return left;
    }
    
    boolean isSubsequence(char[] s,String p){
        int i = 0;
        int j = 0;
        
        while(i<s.length && j<p.length()){
            if(s[i] == p.charAt(j)) j++;
            i++;
        }
        return j == p.length();
    }
}