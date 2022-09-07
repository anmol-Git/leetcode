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
    public String tree2str(TreeNode root) {
        
        StringBuffer sb = new StringBuffer();
        preOrder(root, sb);
        
        return sb.toString();
    }
    
    void preOrder(TreeNode root, StringBuffer sb) {
        
        if(root == null) return;
        sb.append(root.val);
        if(root.left == null && root.right == null) return;
        sb.append("(");
        preOrder(root.left, sb);
         sb.append(")");
        if(root.right != null) {
            sb.append("(");
            preOrder(root.right, sb);
            sb.append(")");
        }
        
    }
}