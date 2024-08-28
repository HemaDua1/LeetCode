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
    levelll(root,0,l);
    return l;
    }
    public void levelll(TreeNode root,int level,List<Integer> l){
       if(root==null){
        return;
       }
      if(level==l.size()){
            l.add(root.val);
        }
        levelll(root.right,level+1,l);
         levelll(root.left,level+1,l);
    }
}
