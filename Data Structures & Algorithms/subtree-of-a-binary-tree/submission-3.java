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
        if (root == null && subRoot == null) {
            return true;
        }

        if (root != null && subRoot != null) {
            if (root.val == subRoot.val) {
                return sameTree(root, subRoot);
            } else {
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }

        return false;
    }

    public boolean sameTree(TreeNode rootNode, TreeNode subRootNode) {
        if (rootNode == null && subRootNode == null) {
            return true;
        }

        if (rootNode != null && subRootNode != null) {
            if (rootNode.val == subRootNode.val) {
                return sameTree(rootNode.left, subRootNode.left) && sameTree(rootNode.right, subRootNode.right)
                || (sameTree(rootNode.left, subRootNode) || sameTree(rootNode.right, subRootNode));
            }
        }

        return false;
    }
}
