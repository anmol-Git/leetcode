class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] a = new int[256];
        
        for(int i=0;i<sentence.length();i++){
            int c =  (int)sentence.charAt(i);
            a[c]++;
        }
        
        for(int i =97;i<=122;i++){
            if(a[i] ==0) return false;
        }
        return true;
    }
}