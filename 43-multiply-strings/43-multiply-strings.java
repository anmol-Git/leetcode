class Solution {
    public String multiply(String s1, String s2) {
        if(s1.equals("0") || s2.equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[s1.length() + s2.length()];
        
        int index = 0;
        long ans = 0;
        
        for(int i = s1.length()-1; i >= 0; i--){
            int curr = s1.charAt(i) - '0';
            
            for(int j = s2.length()-1; j>=0; j--){
                int val = s2.charAt(j) - '0';
                int sum = arr[i+j+1] + curr*val;
                arr[i+j+1] = sum%10;
                arr[i+j] += sum/10;
                
            }
        }
        index = arr[0] == 0 ? 1 : 0;
        while(index<arr.length) sb.append(arr[index++]);
        
        return sb.toString();
    }
}