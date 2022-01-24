class Solution {
    public int nextGreaterElement(int n) {
        if(n<10) return -1;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int i = 0;
        for(i = sb.length()-2; i>=0; i--){
            
            if(sb.charAt(i+1) > sb.charAt(i)){
                char curr = sb.charAt(i);
                int j = sb.length()-1;
                while(j>i && sb.charAt(j) <= sb.charAt(i)) j--;
                char next = sb.charAt(j);
                sb.deleteCharAt(i);
                sb.insert(i,next);
                sb.insert(j,curr);
                sb.deleteCharAt(j+1);
                swap(sb,i+1,sb.length()-1);
                break;
            }
        }
        
        long ans = Long.parseLong(sb.toString());
         
        if((int)ans == n) return -1;
        
        ans = Long.parseLong(sb.toString());
        return ans > (long)Integer.MAX_VALUE ? -1 : (int)ans; 
    }
    
    void swap(StringBuilder sb, int start,int end){
        int mid = start + (end-start)/2;
        while(start<=end){
            char l = sb.charAt(start);
            char r = sb.charAt(end);
            
            sb.insert(start,r);
            sb.deleteCharAt(start+1);
            
            sb.insert(end,l);
            sb.deleteCharAt(end+1);

            start++;
            end--;
        }
    }
}