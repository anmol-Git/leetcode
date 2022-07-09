// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

 class Solution{
    static long minTime(int[] arr,int n,int k){
        //code here
        long start = 0;
        long end = 0;
        long ans = -1;
        
        for(int i = 0; i < n; i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        
        while(start <= end) {
            
            long mid = start + (end - start)/2;
            
            long count = 1;
            long sum = 0;
            
            int i = 0;
            while(i < n) {
                sum += arr[i];
                if(sum > mid) {
                    sum = arr[i];
                    count++;
                }
                i++;
            }
       
            if(count > k) start = mid + 1;
            
            else {
                ans = mid;
                end = mid - 1;
            }
            
        }
        
        return ans;
    }
}


