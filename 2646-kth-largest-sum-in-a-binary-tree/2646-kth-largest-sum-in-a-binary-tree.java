class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        if(root == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        PriorityQueue<Long> minheap = new PriorityQueue<>();


        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                sum += curr.val;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }

            minheap.offer(sum);
            if(minheap.size()>k){
                minheap.poll();
            }
        }

        return minheap.size() < k? -1: minheap.peek();


    }
}