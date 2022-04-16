class Solution {
    public boolean isPalindrome(int x) {
        //String s = String.valueOf(x);
        if(x<0) return false;        
        if(x == 0) return true;
        int len = (int)Math.log10(x)+1;
        
        int[] arr = new int[len];
        
        int temp = x;
        int index = 0;
        
        while(temp > 0) {
            
            arr[index++] = temp%10;
            temp/=10;
            
        }
        
//         int start = 0;
//         int end = len-1;
        
//         while(start<end) {
//             if(arr[start] != arr[end]) return false;
//             start++;
//             end--;
//         }
//         return true;
        String s = String.valueOf(x);
        int i = 0;
         while(i < len/2 + 1) {
             String first = String.valueOf(arr[i]);
             String second = String.valueOf(s.charAt(i));
            if(!first.equals(second)) return false;
            i++;
        }
        
        return true;
    }
}