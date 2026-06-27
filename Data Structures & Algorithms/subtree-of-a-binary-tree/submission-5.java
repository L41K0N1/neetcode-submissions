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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.val == subRoot.val && sameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean sameTree(TreeNode rootNode, TreeNode subRootNode) {
        if (rootNode == null && subRootNode == null) {
            return true;
        }

        if (rootNode == null || subRootNode == null) {
            return false;
        }

        if (rootNode.val != subRootNode.val) {
            return false;
        }

        return sameTree(rootNode.left, subRootNode.left) && sameTree(rootNode.right, subRootNode.right);
    }
}
