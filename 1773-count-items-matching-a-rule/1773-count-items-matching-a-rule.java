class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j =0;
        if(ruleKey.equals("color")) j =1;
        else if(ruleKey.equals("name")) j =2;
        
        int count = 0;
        
        for(int i =0;i<items.size();i++){
            String curr = items.get(i).get(j);
            if(curr.equals(ruleValue)) count++;
        }
        return count;
    }
}