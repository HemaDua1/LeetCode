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
      int[] maxheight=new int[1];
      view(root,maxheight,l,1);
      return l;

    }
    private void view(TreeNode root,int[] maxheight,List<Integer> l,int curr){
        if(root==null)
        return;
        if(curr>maxheight[0]){
            l.add(root.val);
          maxheight[0]=curr;  
        }
        view(root.right,maxheight,l,curr+1);
         view(root.left,maxheight,l,curr+1);
    }
}