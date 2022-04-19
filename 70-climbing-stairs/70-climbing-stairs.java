class Solution {
    public int climbStairs(int n) {
        int []ar=new int[n+1];
        Arrays.fill(ar,-1);
        return fun(n,ar)+1; 
    }
    int fun(int n,int ar[]){
        if(ar[n]!=-1){
            return ar[n];
        }
               if(n==1 || n==0){
            return 0;
        }
    
        return ar[n]=(fun(n-1,ar)+1+fun(n-2,ar));
 
    }
}