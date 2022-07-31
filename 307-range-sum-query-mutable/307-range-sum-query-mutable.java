class NumArray {

    int[] nums;
    private int[] seg;
    int n;
    
    public NumArray(int[] nums) {
        this.nums = nums;
        
        n = nums.length;
        
        this.seg = new int[4*n];
        
        build(0, n - 1, 0);
    }
    
    public void update(int index, int val) {
        
        updateNode(0, n - 1, 0, index, val);
    }
    
    public int sumRange(int left, int right) {
        
        return sumRange(0, n - 1, left, right, 0);
    }
    
    
    private int build(int start, int end, int node) {
        
        if(start > end) return 0;
        
        if(start == end) return seg[node] = nums[start];
        
        int mid = start + (end - start)/2;
        
        int leftSide = build(start, mid, 2 * node + 1);
       int rightSide = build(mid + 1, end, 2 * node + 2);
        
        return seg[node] = leftSide + rightSide;
        
    }
    
    private int updateNode(int start, int end, int node, int index, int val) {
        
        if(start > end) return 0;
        
        if(start > index || end < index) return seg[node];
        
        if(start == end) return seg[node] = val;
        
        int mid = start + (end - start)/2;
        
        int leftSide = updateNode(start, mid, 2*node + 1, index, val);
        int rightSide = updateNode(mid + 1, end, 2*node + 2, index, val);
        
        return seg[node] = leftSide + rightSide;
        
    }
    

    private int sumRange(int start, int end, int is, int ie, int node) {

        if(start > end) return 0;

        if(start > ie || end < is) return 0;

        if(start >= is && end <=ie) return seg[node];

        int mid = start + (end - start)/2;

        int leftSide = sumRange(start, mid, is, ie, 2*node + 1);
        int rightSide = sumRange(mid + 1, end, is, ie, 2*node + 2);

        return leftSide + rightSide;

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */