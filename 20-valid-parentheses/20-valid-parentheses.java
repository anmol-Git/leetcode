class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            
            if(curr == '{' || curr == '[' || curr == '(' || st.isEmpty()){
                st.push(curr);
                continue;
            }
            char peek = st.peek();
            if(peek == '(' && curr == ')') st.pop();
            else if(peek == '{' && curr == '}') st.pop();
            else if(peek == '[' && curr == ']') st.pop();
            else st.add(curr);
            
        }
        return st.isEmpty();
    }
}