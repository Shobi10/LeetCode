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
    private int sum = 0; // To accumulate the sum of left leaves

    public int sumOfLeftLeaves(TreeNode root) {
        solve(root, false); // Start with root and specify it's not a left child
        return sum;
    }

    private void solve(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }

        // Check if the current node is a leaf node
        if (root.left == null && root.right == null) {
            if (isLeft) {
                sum += root.val; // Add the value if it's a left leaf
            }
            return;
        }

        // Recur for the left and right subtrees
        solve(root.left, true); // The left child of the current node is a left node
        solve(root.right, false); // The right child of the current node is not a left node
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
