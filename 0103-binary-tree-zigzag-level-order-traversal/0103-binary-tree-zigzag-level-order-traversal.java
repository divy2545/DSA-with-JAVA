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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int flag = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> l1 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                l1.add(curr.val);

                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);

            }

            if (flag == 0) {
                ans.add(l1);
                flag = 1;
            }
            else{
                Collections.reverse(l1);
                ans.add(l1);
                flag = 0;
            }

        }
        return ans;
    }
}