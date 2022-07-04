// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
            {
                arr[i] = Integer.parseInt(S1[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxValue(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxValue(int[] arr, int N) {
        // code here
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < N; i++) {
            
            max1 = Math.max(max1, arr[i] + i);
            
            min1 = Math.min(min1, arr[i] + i);
            
            max2 = Math.max(max2, -arr[i] + i);
            
            min2 = Math.min(min2, -arr[i] + i);
        }
        
        return Math.max(max1 - min1, max2 - min2);
    }
};