/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> currPath = new ArrayList<>();
        dfs(root, currPath, ans);
        return ans;
    }

    private static void dfs(Node node, ArrayList<Integer> currPath, ArrayList<ArrayList<Integer>> ans) {
        if (node == null) return;

        // Add current node to path
        currPath.add(node.data);

        // If leaf node → save the path
        if (node.left == null && node.right == null) {
            ans.add(new ArrayList<>(currPath));
        } else {
            // Recurse left and right
            dfs(node.left, currPath, ans);
            dfs(node.right, currPath, ans);
        }

        // Backtrack (remove last element)
        currPath.remove(currPath.size() - 1);
    }
}
