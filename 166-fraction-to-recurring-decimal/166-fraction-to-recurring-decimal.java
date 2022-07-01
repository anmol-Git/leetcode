class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long num = numerator;
        long den = denominator;
        if(num == 0) return "0";
        if(den == 0) return "";

        StringBuilder sb = new StringBuilder();
        
        if((num<0) ^ (den<0)) sb.append("-");
        
        num = Math.abs(num);
        den = Math.abs(den);
        
        long quotient = num/den;
       
        sb.append(quotient);
        
        long rem = (num%den) * 10;
        
        if(rem == 0) return sb.toString();
        sb.append(".");
        
        HashMap<Long,Integer> map = new HashMap<>();
                
        while(rem != 0) {
            
            if(map.containsKey(rem)) {
                int index = map.get(rem);
                return sb.substring(0,index) + "(" + 
                       sb.substring(index,sb.length()) +")";
            }
           
            map.put(rem,sb.length());
            
            quotient = rem/den;
            sb.append(quotient);
            
            
            rem = (rem%den) * 10L;
        }
        

        return sb.toString();
    }
}