// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}// } Driver Code Ends


class Solution{
    
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
      //  int[] Rmax = new int[n];
        int[] Lmin = new int[n];
        
        int i = 1;
        Lmin[0] = arr[0];
        while(i < n) {
            Lmin[i] = Math.min(arr[i], Lmin[i-1]);
            i++;
        }
        
        int j = n-1;
        // Rmax[n-1] = arr[n-1]; 
        // while(j >= 0) {
        //     Rmax[j] = Math.max(arr[j], Rmax[j+1]);
        //     j--;
        // }
        
        i = n-1;
        
        int ans = 0;
        
        while(i >= 0 && j >=0) {
            if(arr[i] >= Lmin[j]) {
                ans = Math.max(ans,i - j);
                j--;
            }
            else {
                i--;
            }
        }
        
        return ans;
    }
}


