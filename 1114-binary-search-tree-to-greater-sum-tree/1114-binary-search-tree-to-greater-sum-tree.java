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
    private int cs=0;
    public TreeNode bstToGst(TreeNode root) {
       update(root);
       return root; 
    }
    public void update(TreeNode root){
if(root==null){
    return;
}
update(root.right);
cs+=root.val;
root.val=cs;
update(root.left);
    }
}