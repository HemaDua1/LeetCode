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
    // Queue<TreeNode> q=new LinkedList<>();
    public void flatten(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
     preorder(root,q); 
     while(!q.isEmpty())  {
        TreeNode temp=q.poll();
        temp.right=q.peek();
        temp.left=null;
     }
    }
    public void preorder(TreeNode root,Queue<TreeNode> q){
        if(root==null){
            return;
        }
        q.add(root);
    preorder(root.left,q);
    preorder(root.right,q);
    }
}