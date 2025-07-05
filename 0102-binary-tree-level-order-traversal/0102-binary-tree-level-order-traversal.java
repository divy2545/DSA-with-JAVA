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
    public void helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        q.add(root);
        q.add(null);

         while(!q.isEmpty())
        {
            TreeNode curr = q.remove();
            if(curr == null)
            {
                mainList.add(new ArrayList<>(list));
                list.clear();
                if(q.isEmpty())     break;
                else    q.add(null);
            }
            else
            {
                list.add(curr.val);
                if(curr.left != null)   q.add(curr.left);
                if(curr.right != null)      q.add(curr.right);
            }
        }

    }

    static List<List<Integer>> mainList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        mainList.clear();
        if(root == null)    return mainList;
        helper(root);
        return mainList;   
         
    }
}