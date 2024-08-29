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
    int a=0;
    public int sumRootToLeaf(TreeNode root) {
     path(root,0);
     return a;
    }
    public void path(TreeNode root,int s){
        if(root==null){
        return;
        }
        s=s*2+root.val;
        if(root.left==null&&root.right==null)
        a+=s;
        path(root.left,s);
         path(root.right,s); 
    }
}