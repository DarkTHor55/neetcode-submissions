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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>>ls=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        List<Integer>l=new ArrayList<>();
        queue.offer(root);
        queue.offer(null);
        l.add(root.val);
        ls.add(l);
        while (!queue.isEmpty()) {
            List<Integer>tl=new ArrayList<>();
            while (queue.peek()!=null) {
                TreeNode node = queue.remove();
                if(node.left!=null) {
                    tl.add(node.left.val);
                    queue.add(node.left);
                }if(node.right!=null) {
                    tl.add(node.right.val);
                    queue.add(node.right);
                }
            }
            if(queue.peek()==null) {
                queue.remove();
                if(queue.isEmpty())break;
                queue.offer(null);
                
            }
            ls.add(tl);

            
        }
            
        return ls;
        

    }
}
