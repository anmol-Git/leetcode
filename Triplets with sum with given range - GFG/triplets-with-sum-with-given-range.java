// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[] = new int[N];
            for (int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            String[] input = new String[2];
            input = read.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int R = Integer.parseInt(input[1]);

            Solution ob = new Solution();
            System.out.println(ob.countTriplets(Arr, N, L, R));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
        // code here
        static int countTriplets(int nums[], int n, int l, int r) {
        
        return countLessThanTarget(nums,n,r) - countLessThanTarget(nums,n,l-1);
        
    }
    
    
    static int countLessThanTarget(int[] nums, int n, int target) {
        Arrays.sort(nums);
        
        int count = 0;
        
        for(int i = n-1; i >=  2; i--) {
            int j = 0;
            int k = i - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum <= target) {
                    count += k - j;
                    j++;
                }
                else  k--;
            }
        }
        
        return count;
    }
}