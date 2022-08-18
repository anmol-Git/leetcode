class Solution {
    public int minSetSize(int[] arr) {
        
      Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
        }
        
        
        List<Integer> list = new ArrayList(map.values());
        
        Collections.sort(list, Collections.reverseOrder());
        int len = 0;
        
        int count = 0;
        
        for(int i = 0; i < list.size() && len < arr.length/2; i++) {
            
            len += list.get(i);
            count++;    
        }
        
        return count;
    }
}