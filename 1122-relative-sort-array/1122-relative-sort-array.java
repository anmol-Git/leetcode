class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] countArr = new int[1002];
        int n = arr1.length;
        int m = arr2.length;
        
        for(int i = 0; i < n; i++) {
            countArr[arr1[i]]++;
        }
        
        int index = 0;
        
        for(int i = 0; i < m; i++) {
            int freq = countArr[arr2[i]];
            countArr[arr2[i]] = 0;
            while(freq > 0) {
                arr1[index++] = arr2[i];
                freq--;
            }
        }
        
        for(int i = 0; i < 1002; i++) {
            if(countArr[i] > 0) {
                while(countArr[i]-- > 0) {
                    arr1[index++] = i;
                }
                
           }
        }
        
        return arr1;
    }
}