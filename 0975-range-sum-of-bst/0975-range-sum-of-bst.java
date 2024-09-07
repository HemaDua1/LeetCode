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
    public int rangeSumBST(TreeNode root, int low, int high) {
      return check(root,low,high);  
    }
    public int check(TreeNode root,int l,int h){
        if(root==null)
        return 0;
        int s=0;
        if(root.val>=l&&root.val<=h)
        s+=root.val;
        return s+check(root.left,l,h)+check(root.right,l,h);
    }
}