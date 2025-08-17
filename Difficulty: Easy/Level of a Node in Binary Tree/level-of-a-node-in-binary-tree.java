class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        int lvl = 1;
        
        Queue<Node> q = new LinkedList();
        q.offer(node);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                if(curr.data == data) return lvl;
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                
            }
            lvl++;
        }
        
        return 0;
    }
}