class Solution {
    public int removeDuplicates(int[] arr) {
        int index =0;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i] !=arr[index]){
                index++;
                arr[index] = arr[i];
            }
        }
        return index+1;
    }
}