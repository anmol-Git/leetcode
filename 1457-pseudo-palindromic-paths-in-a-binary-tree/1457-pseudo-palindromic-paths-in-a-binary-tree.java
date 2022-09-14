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
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[10];
        count = 0;
        findPath(root, list, freq);
        
        return count;
    }
    
    void findPath(TreeNode root, ArrayList<Integer> list, int[] freq) {
        
        if(root == null) return;
        
        list.add(root.val);
        freq[root.val]++;
        
        if(root.left == null && root.right == null) {   
            int odd = 0;
            for(int i = 0; i < 10; i++) {
                
                if(freq[i] != 0 && (freq[i]&1) == 1) odd++;
                
            }

           if(((list.size()&1) == 0 && odd == 0 ) || ((list.size()&1) == 1 && odd == 1 )) count++; 
        }
        
        if(root.left != null) findPath(root.left, list, freq);
        if(root.right != null) findPath(root.right, list, freq);
        
        list.remove(list.size() - 1);
        freq[root.val]--;
    }
}