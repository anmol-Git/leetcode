class Solution {
    public List<String> letterCombinations(String digits) {
            return combinations("",digits);
     }
    
    static ArrayList<String> combinations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            if(!p.isEmpty()) ans.add(p);
            return ans;
        }

            int digit = up.charAt(0) - '0';
            ArrayList<String> list = new ArrayList<>();

        if(digit<7){
            for (int i = (digit - 2)*3; i < (digit-1) * 3; i++) {
                char ch = (char)(i + 'a');
               ArrayList<String> tempList = combinations(p+ch,up.substring(1));
               list.addAll(tempList);
            }

        }
        else if(digit == 7){
            for (int i = (digit - 2)*3; i <= (digit-1) * 3; i++) {
                char ch = (char)(i + 'a');
                ArrayList<String> tempList =combinations(p+ch,up.substring(1));
                list.addAll(tempList);
            }
        }
        else if(digit == 8){
            for (int i = ((digit - 2)*3)+1; i <= (digit-1) * 3; i++) {
                char ch = (char)(i + 'a');
                ArrayList<String> tempList =combinations(p+ch,up.substring(1));
                list.addAll(tempList);
            }
        }
        else if(digit == 9){
            for (int i = ((digit - 2)*3) +1; i <= (digit-1) * 3+1; i++) {
                char ch = (char)(i + 'a');
                ArrayList<String> tempList =combinations(p+ch,up.substring(1));
                list.addAll(tempList);
            }
        }
        return list;
    }
}