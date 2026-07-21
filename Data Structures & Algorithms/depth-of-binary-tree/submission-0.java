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
     public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        List<List<Integer>>ls=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        List<Integer>l=new ArrayList<>();
        l.add(root.val);
        while (!queue.isEmpty()){
            List<Integer>tl=new ArrayList<>();
            while (queue.peek()!=null){
                TreeNode temp=queue.remove();
                if(temp.left!=null){
                    queue.offer(temp.left);
                    tl.add(temp.left.val);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                    tl.add(temp.right.val);
                }
            }
            ls.add(tl);
            if(queue.peek()==null){
                queue.remove();
                if(queue.isEmpty())break;
                queue.offer(null);
            }
        }
        return ls.size();
    }
}
