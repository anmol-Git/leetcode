class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] a = new int[256];
        
        for(int i=0;i<sentence.length();i++){
            int c =  (int)sentence.charAt(i);
            a[c]++;
        }
        
        for(int i ='a';i<='z';i++){
            if(a[i] ==0) return false;
        }
        return true;
    }
}