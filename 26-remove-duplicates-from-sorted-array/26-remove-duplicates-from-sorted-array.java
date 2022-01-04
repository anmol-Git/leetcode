class Solution {
    public int removeDuplicates(int[] arr) {
        int index =1;
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] !=arr[i+1]){
                arr[index++] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
        return index;
    }
}