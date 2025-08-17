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
    public int maxLevelSum(TreeNode root) {
        if(root== null) return 0;
        int ans = 1;
        int level = 1;
        int maxSum = root.val;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            if(sum > maxSum){
                    ans = level;
                    maxSum = sum;
                }

            level++;
        }

        return ans;
        
    }
}