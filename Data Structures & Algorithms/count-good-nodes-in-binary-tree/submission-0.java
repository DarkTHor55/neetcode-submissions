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
    public int goodNodes(TreeNode root) {
        return good(root,root.val);
        
    }
    private int good(TreeNode root,int currMax){
        if(root==null)return 0;
        int rootVal=0;
        if(root.val>=currMax){
            rootVal=1;
            currMax=root.val;
        }
        int l=good(root.left,currMax);
        int r=good(root.right,currMax);
        return l+r+rootVal;
    }
}
