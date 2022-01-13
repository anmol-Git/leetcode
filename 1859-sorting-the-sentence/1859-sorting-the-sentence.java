class Solution {
    public String sortSentence(String s) {
        int n = s.length();
        String[] arr = new String[10];
        StringBuilder sb = new StringBuilder();
        int sequence = 0;
        for(int i = 0;i<n;i++){
            char ch =  s.charAt(i);
            
            if(ch>= '1' && ch<= '9'){
                int ind = Integer.parseInt(String.valueOf(ch));
                arr[ind] = s.substring(sequence,i);
                sequence = i+2;
            }
        }
        
        for(int i =0;i<10;i++) 
            if(arr[i] !=null) {
                sb.append(arr[i]);
                sb.append(" ");
            }
        
        return sb.toString().trim();
    }
}