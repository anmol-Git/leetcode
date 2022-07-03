class Solution {
    public int longestConsecutive(int[] nums) {
       
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num,true);
        }
        
        for(int num : nums) {
            if(map.containsKey(num-1)) {
                map.put(num,false);
            }
        }
        
        int max = 0;
        int count = 0;
        
        for(Map.Entry<Integer,Boolean> entry : map.entrySet()) {
            if(entry.getValue() == true) {
                int key = entry.getKey();
                while(map.containsKey(key)) {
                    count++;
                    key++;
                }
                if(max < count) max = count;
                count = 0;
            }
        }
        
        return max;
        // o(nlogn)
//         int max = 1;
//         int count = 1;
//         Arrays.sort(nums);
//         for(int i = 1; i < nums.length; i++){
            
//             if(nums[i] != nums[i-1]) {
//                 if(nums[i] == nums[i-1] + 1) count++;
//                 else {
//                     if(max < count) max = count;
//                     count = 0;
//                 }
//             }
//         }
//         return Math.max(max,count);
    }
}