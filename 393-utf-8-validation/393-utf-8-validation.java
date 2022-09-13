class Solution {
    public boolean validUtf8(int[] data) {
        
        
        int remByte = 0;
        
        for(int val : data) {
            
            if(remByte == 0) {
                
                if((val >> 7) == 0b0) remByte = 0;
                else if((val >> 5) == 0b110) remByte = 1;
                else if((val >> 4) == 0b1110) remByte = 2;
                else if((val >> 3) == 0b11110) remByte = 3;
                else return false;
             }
            else {
                if((val >> 6) == 0b10) remByte--;
                else return false;
            }
        }
        
        return remByte == 0;
    }
}