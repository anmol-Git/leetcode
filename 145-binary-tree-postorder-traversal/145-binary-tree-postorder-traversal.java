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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode node = root;
        
        while(!st.isEmpty() || node != null) {
            
            if(node != null) {
                
                st.push(node);
                node = node.left;
                
            }
            else {
                
                TreeNode temp = st.peek().right;
                
                if(temp == null) {
                    
                    temp = st.pop();
                    list.add(temp.val);
                    
                    while(!st.isEmpty() && st.peek().right == temp) {
                        
                        temp = st.pop();
                        list.add(temp.val);
                        
                    }
                }
                else node = temp;
            }
            
        }
        
        return list;
        
    }
}