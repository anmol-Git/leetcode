class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        
        for(int i = digits.length-1;i>=0;i--) {
            
            digits[i] += carry;
            if(digits[i] > 9) {
                digits[i] = 0;
            } else {
                carry = 0;
                break;
            }
        }
        
        if(carry != 0) {
            int[] arr = new int[digits.length+1];
            Arrays.fill(arr,0);
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}