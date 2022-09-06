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
    public TreeNode pruneTree(TreeNode root) {
        
        if(countOne(root) == 0) return null;
        
        return root;
    }
    
    int countOne(TreeNode root) {
        
        if(root == null) return 0;
        
        if(root.left == null && root.right == null) {
            if(root.val == 1) return 1;
            else return 0;
        }
        
        
        int left = countOne(root.left);
        int right = countOne(root.right);
        
        if(left == 0) root.left = null;
        
        if(right == 0) root.right = null;
        
        return left + right + (root.val == 0 ? 0 : 1);
        
    }
}