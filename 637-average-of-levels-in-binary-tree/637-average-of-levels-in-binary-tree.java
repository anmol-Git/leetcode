class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    
        List<Double> list = new ArrayList<>();

        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            int count = 0;
            double avg = 0;
            while(count++ < size) {
                
                TreeNode curr = q.remove();
                avg += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                 
            }
            
            list.add(avg/size);
            
        }
        
        return list;
    }
}