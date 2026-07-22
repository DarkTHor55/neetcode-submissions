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
     boolean isBal=true;
    public boolean isBalanced(TreeNode root) {
       bal(root);
       return isBal;
    }
    private int bal(TreeNode root) {
        if (root == null) return 0;
        int l = bal(root.left);
        int r = bal(root.right);
        if (Math.abs(l-r)>1) {

            isBal = false;
        }
        return 1+Math.max(l,r);
    }
}
