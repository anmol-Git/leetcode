class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        
        
        for(int i = 0; i < queries.length; i++){
            // number of capital must be equal
            // they must be same and in series
             list.add(doesMatch(queries[i],pattern));
        }
        return list;
    }
    
    boolean doesMatch(String text,String pattern){
        int i = 0;
        int j = 0;
        
        while(i < text.length() && j < pattern.length()){
            
            if(text.charAt(i) == pattern.charAt(j)) j++;
            else if(text.charAt(i) < 97) return false;
            i++;
            
        }
        
        while(i < text.length()){
            if(text.charAt(i) < 97) return false;
            i++;
        }
        
        return j == pattern.length();
    }
}