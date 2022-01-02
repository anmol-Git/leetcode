class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int index = num.length-1;
        while(k>0 && index>=0){
            int kRem = k%10;
            int sum = 0;
            if(carry!=0){
            sum = kRem + num[index] + carry;
            carry =0;
            }
            else sum = kRem + num[index];
            if(sum >9){
                carry = sum/10;
                sum = sum%10;
            }
            list.add(sum);
            k=k/10;
            index--;
        }
        
        if(index>=0){
            if(carry!=0){
                while(index>=0){
                    int sum = num[index] + carry;
                    carry = 0;
                    if(sum>9){
                        carry = sum/10;
                        sum = sum%10;
                    }
                    list.add(sum);
                    index--;
                }
            }else{
                while(index>=0){
                    list.add(num[index]);
                    index--;
                }
            }
        }
        
       else if(k>0){
            if(carry != 0){
                while(k>0){
                    int kRem = k%10;
                    int sum = kRem + carry;
                    carry = 0;
                    if(sum>9){
                        carry = sum/10;
                        sum = sum%10;
                    }
                    list.add(sum);
                    k=k/10;
                }
            }else{
                while(k>0){
                    list.add(k%10);
                    k=k/10;
                }
            }
        }
        
        if(carry !=0) list.add(carry);
        
        Collections.reverse(list);
            
        return list;
    }
}