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
        
        for(int i = 0;i<n;i++) {
            
            if((i&1) == 0){
                if(arr[i] < 0) {
                    int j = i+1;
                    while(j < arr.length) {
                        if(arr[j] >= 0) break;
                        j++;
                    }
                    if(j == arr.length) break;
                    bringFront(arr,i,j);
                }
                
            } else {
                if(arr[i] >= 0) {
                    int j = i+1;
                    
                    while(j < arr.length) {
                        if(arr[j] < 0) break;
                        j++;
                    }
                    
                    if(j == arr.length) break;
                    bringFront(arr,i,j);
                }
                
            }
        }
    }
    
    void bringFront(int[] arr ,int start, int end) {
        int temp = arr[end];
        
        while(end > start) {
            arr[end] = arr[end-1];
            end--;
        }
        
        arr[start] = temp;
    }
}