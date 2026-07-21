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
    TreeNode node;
     public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        node=new TreeNode(root.val);
        invert(root,node);
        return node;
        

    }

private void invert(TreeNode root, TreeNode node) {
    if(root==null)return;
    if(root.right!=null)
    node.left=new TreeNode(root.right.val);
    if(root.left!=null)
    node.right=new TreeNode(root.left.val);
    invert(root.right, node.left);
    invert(root.left, node.right);


}
}
