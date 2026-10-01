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
    public boolean isValidBSTHelper(TreeNode node, long Min, long Max){
        if(node == null) return true;
        if(node.val <= Min) return false;
        if(node.val >= Max) return false;
        return isValidBSTHelper(node.left, Min, node.val) && isValidBSTHelper(node.right,node.val, Max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}