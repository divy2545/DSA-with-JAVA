class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        if(root == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        List<Long> list = new ArrayList<>();

        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                sum += curr.val;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }

            list.add(sum);
        }

        if(list.size()<k) return -1;

        Collections.sort(list);

        return list.get(list.size()-k);


    }
}