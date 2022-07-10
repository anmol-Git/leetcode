// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to find minimum number of pages.
    public static int findPages(int[]a, int n, int m) {
        //Your code here
        int start = 0;
        int end = 0;
        int ans = -1;
        
        for(int i = 0; i < n; i++) {
            start = Math.max(start, a[i]);
            end += a[i];
        }
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            int student = 1;
            int sum = 0;
            
            for(int i = 0; i < n; i++) {
                sum += a[i];
                
                if(sum > mid) {
                    sum = a[i];
                    student++;
                }
            }
           
            if(student > m ) start = mid + 1;
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        
        return ans;
    }
}