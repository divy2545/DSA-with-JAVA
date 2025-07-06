/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int sum = 0;

    public int leafSum(Node root) {
        helper(root);
        return sum;
    }

    private void helper(Node root) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            sum += root.data;
        }

        helper(root.left);
        helper(root.right);
    }
}
