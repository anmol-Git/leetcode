// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        return trap(arr);
    } 
    
    static public long trap(int[] height) {
        int len = height.length;
        long[] Lmax = new long[len];
        long[] Rmax = new long[len];
        
        Lmax[0] = height[0];
        Rmax[len - 1] = height[len - 1];
        
        for (int i = 1; i < len; i++) {
            Lmax[i] = Math.max(Lmax[i-1], height[i]);
            Rmax[len - i - 1] = Math.max(Rmax[len-i], height[len-i-1]);
        }
        
        long totalWater = 0;
        
        for(int i = 0; i < len ; i++) {
            totalWater += Math.min(Lmax[i],Rmax[i]) - height[i];    
        }
        
        return totalWater;
    }
}


