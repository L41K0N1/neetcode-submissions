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

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        depth(root);
        return maxDiameter;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int rightDepth = depth(node.left);
        int leftDepth = depth(node.right);

        if ((rightDepth + leftDepth) > maxDiameter) {
            maxDiameter = rightDepth + leftDepth;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
