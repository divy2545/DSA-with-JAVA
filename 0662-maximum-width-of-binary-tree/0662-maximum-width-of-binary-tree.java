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

class Pair {
    TreeNode node;
    long idx;

    Pair(TreeNode node, long idx) {
        this.node = node;
        this.idx = idx;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        int width = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            long first = 0, last = 0;
            for (int i = 0; i < n; i++) {
                Pair curr = q.poll();
                TreeNode node = curr.node;
                if (i == 0)
                    first = curr.idx;
                if (i == n - 1)
                    last = curr.idx;

                if (node.left != null)
                    q.offer(new Pair(node.left, 2 * curr.idx));
                if (node.right != null)
                    q.offer(new Pair(node.right, 2 * curr.idx + 1));
            }

            width = Math.max(width, (int) (last - first + 1));

        }

        return width;
    }
}
