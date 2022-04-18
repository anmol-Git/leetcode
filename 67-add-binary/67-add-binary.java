import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger num0 = new BigInteger(a, 2);
        BigInteger num1 = new BigInteger(b, 2);
        BigInteger sum=num0.add(num1);
        String ans=sum.toString(2);
        return ans;}
}