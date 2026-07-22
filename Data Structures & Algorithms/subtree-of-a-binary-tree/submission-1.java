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
    boolean isBal=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null)isBal= true;
        if(root==null&&subRoot!=null)isBal= false;
        if(root!=null&&subRoot==null)isBal= false;
        check(root,subRoot);
        return isBal;
    }
    private void check(TreeNode root,TreeNode subRoot){
        if(root==null|| isBal)return;
        if (root.val == subRoot.val && valid(root, subRoot)) {
            isBal = true;
            return;
        }

        check(root.left,subRoot);
        check(root.right,subRoot);
    }
    private boolean valid(TreeNode root,TreeNode subRoot){
        if (root == null && subRoot == null) return true;
        if((root==null&&subRoot!=null)||(root!=null&&subRoot==null))return false;
        if(root.val!=subRoot.val)return false;
        return valid(root.left,subRoot.left)&&valid(root.right,subRoot.right);
    }
}
