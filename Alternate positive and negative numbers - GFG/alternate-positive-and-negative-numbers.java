// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        int i = 0;
        int isEven = 1;
        int j = 0;
        while(i<arr.length){
            if(isEven == 1) {
               if(arr[i] < 0) {
                    j = i;
                    while(j<arr.length) {
                        if(arr[j]>=0) break;
                        j++;
                    }
                    if(j == arr.length) break;
                    bringFront(arr,i,j);
               } 
            } 
            else {
                if(arr[i] >= 0) {
                   j = i;
                    while(j<arr.length) {
                        if(arr[j]<0) break;
                        j++;
                    }
                    if(j == arr.length) break;
                    bringFront(arr,i,j);
                }
            }
            i++;
            isEven = isEven ^ 1;
        }
        
    }
    
    static void bringFront(int[] arr,int start,int end) {
        int temp = arr[end];
        
        for(int i = end;i > start; i-- ){
            arr[i] = arr[i-1];
        }
        
        arr[start] = temp;
    }
}