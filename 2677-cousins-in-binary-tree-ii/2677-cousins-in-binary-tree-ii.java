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
    public TreeNode replaceValueInTree(TreeNode root) {
     dfs(new TreeNode[] {root});
     root.val=0;
     return root;   
    }
    public void dfs(TreeNode[] arr){
        if(arr.length==0)
        return ;
        int s=0;
        for(TreeNode n:arr){
            if(n==null)
            continue;
            if(n.left!=null)
            s+=n.left.val;
             if(n.right!=null)
            s+=n.right.val;
        }
        TreeNode[] childarr=new TreeNode[arr.length*2];
        int i=0;
        for(TreeNode n:arr){
            int cs=0;
             if(n.left!=null)
            cs+=n.left.val;
             if(n.right!=null)
            cs+=n.right.val;
            if(n.left!=null){
                n.left.val=s-cs;
                childarr[i++]=n.left;
            }
            if(n.right!=null){
                n.right.val=s-cs;
                childarr[i++]=n.right;
            }
        } 
        dfs(java.util.Arrays.copyOf(childarr,i));
    }
}