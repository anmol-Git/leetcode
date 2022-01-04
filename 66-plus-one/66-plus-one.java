class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int carry =1;
        int index = digits.length-1;
        while(index>=0){
            int sum = digits[index] + carry;
            carry = 0;
            if(sum >9){
                carry = sum/10;
                sum = sum%10;
            }
            ans.add(sum);
            index--;
        }
        if(carry!=0) ans.add(carry);
        Collections.reverse(ans);
        
        int[] res = ans.stream().mapToInt(i->i).toArray();
        
        return res;
    }
}