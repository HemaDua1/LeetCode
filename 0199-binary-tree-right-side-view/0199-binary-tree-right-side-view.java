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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> l=new ArrayList<>();
     if(root==null)
     return l;
     Queue<TreeNode> q=new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int s=q.size();
        for(int i=0;i<s;i++){
            TreeNode n=q.poll();
            if(i==s-1)
            l.add(n.val);
            if(n.left!=null)
            q.add(n.left);
            if(n.right!=null)
            q.add(n.right);
        }
     }
        return l;
     }
}
