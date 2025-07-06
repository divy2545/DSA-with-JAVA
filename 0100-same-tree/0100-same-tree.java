class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
         if((p==null && q!=null) || (p!=null && q==null)) return false;
       
       Stack<TreeNode> st1 = new Stack<>();
       Stack<TreeNode> st2 = new Stack<>();
       st1.push(p);
       st2.push(q);
       
       while(!st1.isEmpty()){
           TreeNode top1 = st1.pop();
           TreeNode top2 = st2.pop();
           
           int value1 = top1.val;
           int value2 = top2.val;
           
           if(value1 != value2) return false;
              
              
           if(top1.right !=null ){
               if(top2.right != null){
            st1.push(top1.right);
            st2.push(top2.right);
               }
            else if(top2.right == null){
                return false;
            }
     }
    
               if(top2.right !=null ){
               if(top1.right != null){
            st1.push(top1.right);
            st2.push(top2.right);
               }
            else if(top1.right == null){
                return false;
            }
     }




             
           if(top1.left !=null ){
               if(top2.left != null){
            st1.push(top1.left);
            st2.push(top2.left);
               }
            else if(top2.left == null){
                return false;
            }
     }
    
               if(top2.left !=null ){
               if(top1.left != null){
            st1.push(top1.left);
            st2.push(top2.left);
               }
            else if(top1.left == null){
                return false;
            }
     }
           
           
       }
       
       
       if(!st2.isEmpty()) return false;
       else return true;
       
    }
}























// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
       
//       Stack<TreeNode> st1 = new Stack<>();
//       Stack<TreeNode> st2 = new Stack<>();
      
//        st1.push(p);
//        st2.push(q);

//        boolean flag=true;
//        while(!st1.isEmpty() && !st2.isEmpty()){
//         TreeNode c1  = st1.pop();
//         TreeNode c2 = st2.pop();
        
//         if(c1.val != c2.val) return false;
//         flag = (c1.left == null && c2.left == null);
//         flag = (c1.right == null && c2.right == null);
//         if(flag==false) return false;
        
//         if(c1.left!=null) st1.push(c1.left);
//         if(c2.left!=null) st2.push(c2.left);
          
//          if(c1.right!=null) st1.push(c1.right);
         
//          if(c2.right!=null) st2.push(c2.right);

//        }
              
//        if(!st1.isEmpty() || !st2.isEmpty() ) return false;
//        return true;
//     }
// }

