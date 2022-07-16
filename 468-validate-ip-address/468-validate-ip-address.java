class Solution {
    public String validIPAddress(String s) {
        
        if(s.length() < 2) return "Neither";
        
        if(isIp4(s)) return "IPv4";
        if(isIp6(s)) return "IPv6";
        return "Neither";
        
    }
    
    boolean isIp4(String s) {
        if(s.indexOf(':') != -1) return false;
        
         if(s.charAt(s.length() - 1) == ':' ||s.charAt(s.length() - 1) == '.') return false;
        
        String[] parts = s.split("\\.");
        if(parts.length != 4) return false;
        

        for(int i = 0; i < 4; i++) {
          try{
                int curr = Integer.parseInt(parts[i]);
              
              if(curr < 0 || curr > 255 ||
               (parts[i].charAt(0) == '0' && parts[i].length() > 1)) return false;
              
          } catch(Exception e) {
              return false;
          }
            
        }
        return true;
    }
    
     boolean isIp6(String s) {
        if(s.indexOf('.') != -1) return false;
         
         String hexDigit = "1234567890abcdefABCDEF";
        if(hexDigit.indexOf(s.charAt(s.length() - 1)) == -1) return false;
        String[] parts = s.split("\\:");
        
        if(parts.length != 8) return false;
         
         for(int i = 0; i < 8; i++) {
             
             String curr = parts[i];
             
             if(curr.length() < 1 || curr.length() > 4) return false;
             
             for(char ch : curr.toCharArray()) {
                 if(hexDigit.indexOf(ch) == -1) return false;
             }
             
         }
        return true;
    }
}