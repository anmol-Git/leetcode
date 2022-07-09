class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    if(nums1.length > nums2.length) return findMedianSortedArrays(nums2,nums1);
        
        int n = nums1.length;
        int m = nums2.length;
        
        int total = n + m;
        
        int start = 0;
        int end = n;
        
        while(start <= end) {
            
            int aleft = start + (end - start)/2;
            int bleft = (total+1)/2 - aleft;
            
            int a1 = (aleft == 0) ? Integer.MIN_VALUE : nums1[aleft - 1];
            int a2 = (aleft == n) ? Integer.MAX_VALUE : nums1[aleft];
            int b1 = (bleft == 0) ? Integer.MIN_VALUE : nums2[bleft - 1];
            int b2 = (bleft == m) ? Integer.MAX_VALUE : nums2[bleft];
            
            
            if(a1 <= b2 && b1 <= a2) {
                int min = Math.min(a2,b2);
                int max = Math.max(a1,b1);
                
                if(total%2 == 0) {
                    return (double)(min + max)/2;
                }else {
                    return (double) max;
                }
            }
            
            else if(a1 > b2) end = aleft - 1;
            
            else start = aleft + 1;
        }
        
        return -1;
    }
}