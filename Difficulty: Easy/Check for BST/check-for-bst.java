/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean helper(Node root, long min, long max) {
        if (root == null) return true;
        
        // Current node must be in the valid range
        if (root.data <= min || root.data >= max) return false;
        
        // Left subtree must be within (min, root.data)
        // Right subtree must be within (root.data, max)
        return helper(root.left, min, root.data) &&
               helper(root.right, root.data, max);
    }
}
