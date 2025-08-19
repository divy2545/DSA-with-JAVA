/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/


            


class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int minDiff(Node root, int K) {
        int floor = -1, ceil = -1;
        Node curr = root;

        while (curr != null) {
            if (curr.data == K) {
                return 0; // exact match -> min difference is 0
            } else if (curr.data > K) {
                ceil = curr.data; // potential ceil
                curr = curr.left;
            } else {
                floor = curr.data; // potential floor
                curr = curr.right;
            }
        }

        // Now calculate minimum absolute difference
        int left = (floor == -1) ? Integer.MAX_VALUE : Math.abs(K - floor);
        int right = (ceil == -1) ? Integer.MAX_VALUE : Math.abs(K - ceil);

        return Math.min(left, right);
    }
}
