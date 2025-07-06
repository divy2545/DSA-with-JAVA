// ================ Iterative Code =============

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int n = q.size();

                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right =temp;

                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null )q.offer(curr.right);
        }
        return root;
    }
}

// ================ Recursive Code =============

// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root==null) return null;

//         TreeNode temp = root.left;
//          root.left = root.right;
//          root.right =temp;

//          invertTree(root.left);
//          invertTree(root.right);

//         return root;
//     }
// }
