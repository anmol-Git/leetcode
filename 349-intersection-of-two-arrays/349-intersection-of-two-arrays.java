class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++) {
            
            map.put(nums1[i], i);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums2.length; i++) {
            
           if(map.containsKey(nums2[i]) && !list.contains(nums2[i])) {
               
                list.add(nums2[i]);       
           }
        }
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
}