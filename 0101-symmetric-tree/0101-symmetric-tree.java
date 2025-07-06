// class Solution {
//     public boolean isSymmetric(TreeNode root) {
       
//        Queue<TreeNode> q = new LinkedList<>();
       
//        q.offer(root);
//        while(!q.isEmpty()){
//        TreeNode curr = q.poll();
          
//           TreeNode t1 = curr.left;
//            TreeNode t2 = curr.right;
           
//         //   if(curr.left ==null && curr.right == null) continue;
//         //   if(curr.left == null || curr.right ==null || curr.left.val != curr.right.val) return false;
        
//         if(t1 ==null && t2 == null) continue;
//           if(t1 == null || t2 ==null || t1.val != t2.val) return false;
          
//           q.offer(t1.left);
//           q.offer(t2.right);
//           q.offer(t1.right);
//           q.offer(t2.left);
//        }

//        return true; 

//     }
// }

































































class Solution {
    public boolean isSymmetric(TreeNode root) {
    if(root.left == null && root.right ==null) return true;
     if(root.left == null || root.right ==null) return false;
     
        TreeNode p = root.left;
        TreeNode q = root.right;
        
        Queue<TreeNode> Q = new LinkedList<>();
        
        Q.offer(p);
        Q.offer(q);
        
        while(!Q.isEmpty()){
            TreeNode t1 = Q.poll();
            TreeNode t2 = Q.poll();
            
            if(t1 == null && t2 == null) continue;
            
            if(t1==null || t2== null || t1.val != t2.val) return false;
            Q.offer(t1.left);
            Q.offer(t2.right);
            Q.offer(t1.right);
            Q.offer(t2.left);
            
            
        }
        
        return true;
        
    }
}