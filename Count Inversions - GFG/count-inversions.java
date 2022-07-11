// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long [] temp= new long[(int)N];
        return mergesort(arr,temp,0,(int)N-1);
    }
    
    static long mergesort(long [] a,long[] temp,int left,int right){
        long inv=0;
        if(left<right){
            int mid=(left+right)/2;
            inv+=mergesort(a,temp,left,mid);
            inv+=mergesort(a,temp,mid+1,right);
            inv+=merge(a,temp,left,mid+1,right);
        }
        return inv;
    }
    static long merge(long []a,long[] temp,int left,int mid,int right){
        int i,j,k;
        long inv=0;
        i=left;
        j=mid;
        k=left;
        while((i<=mid-1) && (j<=right)){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
                inv+=(mid-i);
            }
        }
        while(i<=mid-1){
            temp[k++]=a[i++];
        }
        while(j<=right){
            temp[k++]=a[j++];
        }
        for(int m=left;m<=right;m++){
            a[m]=temp[m];
        }
        return inv;
    }
    
}