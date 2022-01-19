class Solution {
    public int numberOfSteps(int num) {
        
        return fun(num,0);
    }
    
    int fun(int num,int step){
        if(num == 0) return step;
        
        if((num&1) == 0) return fun(num/2,step+1);
        
        return fun(num - 1, step+1);
    }
}