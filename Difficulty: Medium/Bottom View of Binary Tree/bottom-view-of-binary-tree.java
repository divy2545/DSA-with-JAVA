/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Map<Integer, Integer> mp = new TreeMap<>();
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        root.hd = 0;
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            int hd = curr.hd;
            mp.put(hd, curr.data);
            if(curr.left != null){
                curr.left.hd = hd - 1;
                q.offer(curr.left);
            }
            if(curr.right != null){
                curr.right.hd = hd+1;
                q.offer(curr.right);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}