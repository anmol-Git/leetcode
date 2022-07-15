// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.nextPalin(s));
        }
            
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public String nextPalin(String n) { 
        int len = n.length();
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int mid = (len/2) - 1;
        
        int i = 0;
        
            for( i = mid - 1; i >= 0; i--) {
                if(sb.charAt(i) < sb.charAt(i+1)) {
                    break;
                }
            }
            
             if(i < 0) return "-1";
        
        int j = 0;
        int smallest = i + 1;
        
         for (j = i + 2; j <= mid; j++) {
            
                if(sb.charAt(j) >  sb.charAt(i) &&  sb.charAt(j) <= sb.charAt(smallest)) smallest = j;
         }
        
          char temp = sb.charAt(i);
    
        sb.setCharAt(i, sb.charAt(smallest));
        
        sb.setCharAt(smallest, temp);
        
        
        int firstInd = len - smallest - 1;
        int secondInd = len - i -  1;
        
        temp = sb.charAt(firstInd);
        
        sb.setCharAt(firstInd, sb.charAt(secondInd));
        
        sb.setCharAt(secondInd , temp);
        
        reverse(sb, i + 1, mid);
        
        if((len&1) == 0) reverse(sb,mid + 1, len - i - 2);
        else reverse(sb, mid + 2, len - i - 2);
         
        return sb.toString();
        
    }
    
    void reverse(StringBuilder sb, int start, int end) { 
       // System.out.println("reverse: " + start + " "+ end);
        while(start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}
