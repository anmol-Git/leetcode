class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<address.length();i++){
            char curr = address.charAt(i);
    
            if(curr == '.'){
                sb.append("[");
                sb.append(".");
                sb.append("]");
            }else sb.append(curr);
        }
        return sb.toString();
    }
}