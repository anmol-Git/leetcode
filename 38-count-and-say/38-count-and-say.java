class Solution {
    public String countAndSay(int n) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        
        
        for(int i = 2; i <= n; i++) {
            
          StringBuilder s2 = new StringBuilder();  
           
            if(sb.length() == 1) s2.append("11");
            else {
                int start = 0;
                int j = 1;
            
            while(j < sb.length() ) {
                
                if(sb.charAt(j) != sb.charAt(j - 1)) {
                    
                    s2.append(String.valueOf(j - start));
                    s2.append(sb.charAt(start));
                    start = j;
                }
                j++;
            }
            if(start != j) {
                s2.append(String.valueOf(j - start));
                s2.append(sb.charAt(start));
            }
        }
            sb.setLength(0);
            sb.append(s2.toString());
            //System.out.println(sb.toString());
        }
        
        return sb.toString();
    }
}