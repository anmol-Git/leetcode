class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int len = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Pairs> pq = new PriorityQueue<>((o1, o2) -> o2.value - o1.value);
        
//         for(Map.Entry<Integer, Integer> a : map.entrySet()) {
            
//             list.add(new Pairs(a.getKey(), a.getValue()));
//         }
        
        map.forEach((key, value) -> {
           pq.add(new Pairs(key, value)); 
        });
        
       // Collections.sort(list, (o1, o2) -> o2.value - o1.value);
        
        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll().num;
        }
        return ans;
    }
    
class Pairs {
    int num;
    int value;
    
    Pairs(int num, int value) {
        this.num = num;
        this.value = value;
    }
}
}
