// ============== RECURSIVE APPROACH =========================

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;

        if(p==null || q==null || p.val != q.val) return false;

    return isSameTree(p.left , q.right) && isSameTree(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
         return isSameTree(root.left, root.right);
}

}

//=================== ITERATIVE APPROACH ========================

// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//     if(root.left == null && root.right ==null) return true;
//      if(root.left == null || root.right ==null) return false;

//         TreeNode p = root.left;
//         TreeNode q = root.right;

//         Queue<TreeNode> Q = new LinkedList<>();

//         Q.offer(p);
//         Q.offer(q);

//         while(!Q.isEmpty()){
//             TreeNode t1 = Q.poll();
//             TreeNode t2 = Q.poll();

//             if(t1 == null && t2 == null) continue;

//             if(t1==null || t2== null || t1.val != t2.val) return false;
//             Q.offer(t1.left);
//             Q.offer(t2.right);
//             Q.offer(t1.right);
//             Q.offer(t2.left);

//         }

//         return true;

//     }
// }
