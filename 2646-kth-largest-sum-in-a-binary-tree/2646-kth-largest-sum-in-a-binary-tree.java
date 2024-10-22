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
    public long kthLargestLevelSum(TreeNode root, int k) {
   ArrayList<Long> l=new ArrayList<>();
   level(root,l);
   Collections.sort(l,Collections.reverseOrder());
   if(l.size()<k)
   return -1;
   return l.get(k-1);     
    }
    public void level(TreeNode root,ArrayList<Long> l){
        if(root==null)
        return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
             long sum=0;
            for(int i=0;i<s;i++){
          TreeNode n=q.poll();
          sum+=n.val;
         if(n.left!=null)
        q.add(n.left);
        if(n.right!=null)
          q.add(n.right);
            }
            l.add(sum);
        }
    }
}