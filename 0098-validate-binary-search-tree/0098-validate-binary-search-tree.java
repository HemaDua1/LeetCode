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
    class pair{
        boolean isbal=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
      
    }
    public boolean isValidBST(TreeNode root) {
    return check(root).isbal;
}
public pair check(TreeNode root){
  if(root==null){
    return new pair();
  }  
  pair lp=check(root.left);
  pair rp=check(root.right);
pair self=new pair();
if(root.val>lp.max && root.val<rp.min && lp.isbal && rp.isbal){
self.isbal=true;
self.min=Math.min(root.val,Math.min(lp.min,rp.min));
self.max=Math.max(root.val,Math.max(lp.max,rp.max));
}
else{
    self.isbal=false;
}
return self;
}
}