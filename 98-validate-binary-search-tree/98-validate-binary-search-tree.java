/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> list = inorder(root);
        
        for(int i = 1; i < list.size(); i++) {
            
            if(list.get(i) <= list.get(i - 1)) return false;
        }
        
        return true;
    }
    
    
    List<Integer> inorder(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode node = root;
        
        while(true) {
            
            while(node != null) {
                
                stack.push(node);
                node = node.left;
            }
            if(stack.isEmpty()) break;
            
            
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}