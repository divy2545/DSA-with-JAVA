/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair {
    Node node;
    int hd;   // horizontal distance

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}


class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int hd = curr.hd;
            Node currnode = curr.node;
            if(!mp.containsKey(hd)){
            mp.put(hd, currnode.data);
            }
            
            if(currnode.left!= null){
                q.offer(new Pair(currnode.left, hd-1));
            }
            
            if(currnode.right!= null){
                q.offer(new Pair(currnode.right, hd+1));
            }
            
        }
        
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
        
    }
}