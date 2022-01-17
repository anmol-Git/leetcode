class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()) return false;
        
        int index = 0;
        int i = 0;
        for(i = 0; i < typed.length(); i++){
            if(index < name.length() && typed.charAt(i) == name.charAt(index)) index++;
            else if(i == 0 || typed.charAt(i-1) != typed.charAt(i)) return false; 
        }
        
        return index == name.length();
    }
}