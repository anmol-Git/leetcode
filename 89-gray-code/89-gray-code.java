class Solution {
    public List<Integer> grayCode(int n) {
        
        if(n == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            
            return list;
        }
        
        List<Integer> prevList = grayCode(n - 1);
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < prevList.size(); i++) {
            
            ans.add(prevList.get(i));
        
        }

        int mask = 1<<(n - 1);
        
        for(int i = prevList.size() - 1; i >= 0; i--) {
            
            int temp = (prevList.get(i) | mask);
            
            ans.add(temp); 
        }
        
        return ans;
    }
}