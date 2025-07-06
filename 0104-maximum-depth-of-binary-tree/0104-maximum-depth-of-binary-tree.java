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
    int depth = 1;
    int maxdepth = 1;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        helper(root,depth);
        return maxdepth;
    }

    public void helper(TreeNode root, int depth){
          if(root == null) return;

          maxdepth = Math.max(maxdepth,depth); 

          helper(root.left,depth+1);
          helper(root.right, depth+1);
    }
}