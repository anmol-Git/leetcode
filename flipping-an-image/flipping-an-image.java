class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        
        for(int i =0;i<r;i++){
            reverse(image[i]);
        }
        return image;
    }
    
    void reverse(int[] nums){
        int start =0;
        int end = nums.length-1;
        
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            nums[start] ^= 1;
            nums[end] ^= 1;
            start++;
            end--;
        }
        if(start == end) nums[start] ^=1;
    }
}