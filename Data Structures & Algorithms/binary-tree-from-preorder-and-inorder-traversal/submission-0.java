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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return tree(preorder,inorder,0,inorder.length-1,0);


    }
    private TreeNode tree(int[] preorder, int[] inorder,int st,int ed,int pos) {
        if(st>ed)return null;
        TreeNode node =new TreeNode(preorder[pos]);
        int idx=idxFind(preorder[pos],inorder,st,ed);
         node.left=tree(preorder,inorder,st,idx-1,pos+1);
        node.right=tree(preorder,inorder,idx+1,ed,pos+(idx-st)+1);
        return node;



    }
    private int idxFind(int num,int[] arr,int st,int ed) {
        for (int i = st; i <= ed; i++) {
            if(num==arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
