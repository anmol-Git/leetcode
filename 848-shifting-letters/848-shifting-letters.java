class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
          int n = s.length();
         int [] arr = new int[n];
         
        int sum = 0;
        for(int i = n-1;i>=0;i--){
            arr[i] = (shifts[i] + sum)%26;
            sum = (sum + shifts[i])%26;
            arr[i] += s.charAt(i) - 'a';
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<n;i++){
            char num = (char)('a' + arr[i]%26);
            sb.append(num);
        }
        return sb.toString();
    }
}