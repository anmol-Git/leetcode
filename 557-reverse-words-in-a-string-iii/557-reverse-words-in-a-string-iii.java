class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0;i<arr.length;i++){
            
            for(int j = arr[i].length()-1;j>=0;j--){
                sb.append(arr[i].charAt(j));
            }
            sb.append(' ');
        }
        
        return sb.toString().trim();
    }
}