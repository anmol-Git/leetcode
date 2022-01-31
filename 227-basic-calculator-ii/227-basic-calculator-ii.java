class Solution {
    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char sign = '+';
        int n = s.length();
        int sum = 0;

        for(int i = 0;i<n;i++){

            char ch = s.charAt(i);
             if(Character.isDigit(ch)){
                 int val = 0;
                 while (i<n && Character.isDigit(s.charAt(i))){
                     val = val*10 + (s.charAt(i) - '0');
                     i++;
                 }
                 i--;
                 if (sign == '+'){
                     st.push(val);
                 }else if(sign == '-'){
                     st.push(-val);
                 }else if(sign == '*'){
                     int temp = st.pop();
                     temp = temp*val;
                     st.push(temp);
                 }else if(sign == '/'){
                     int temp = st.pop();
                     temp = temp/val;
                     st.push(temp);
                 }
             }else if(ch != ' '){
                 sign = ch;
             }
        }
        while (!st.isEmpty()) sum+=st.pop();

        return sum;
    }
}