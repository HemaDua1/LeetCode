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
    public int sumRootToLeaf(TreeNode root) {
     List<String> l =new ArrayList<>();
     path(root,"",l);
     int j=0;
     for(int i=0;i<l.size();i++){
        String k=l.get(i);
j+=Integer.parseInt(k,2);
     }   
     return j;
    }
    public void path(TreeNode root,String ans,List<String> l){
        if(root==null){
        return;
        }
        ans+=root.val;
        if(root.left==null&&root.right==null)
        l.add(ans);
        else{
        path(root.left,ans,l);
         path(root.right,ans,l); 
    }
    }
}