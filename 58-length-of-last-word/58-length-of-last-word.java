class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        s = s.trim();
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}