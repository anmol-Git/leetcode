class Solution {
    public String convertToTitle(int num) {
        
        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
           char rem = (char)('A' + (num-1)%26);
            sb.append(rem);
            num= (num-1)/26;
        }
        
        return sb.reverse().toString();
    }
}