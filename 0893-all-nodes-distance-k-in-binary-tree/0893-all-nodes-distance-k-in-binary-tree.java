/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        dfs(root,target,k,l);
        return l;
   }
   public int dfs(TreeNode root,TreeNode target,int k,ArrayList<Integer> l){
    if(root==null)
    return -1;
    if(root==target){
        findNode(root,k,l);
        return 0;
    }
    int le=dfs(root.left,target,k,l);
    if(le!=-1){
        if(le+1==k)
        l.add(root.val);
        findNode(root.right,k-le-2,l);
        return le+1;
    }
       int r=dfs(root.right,target,k,l);
    if(r!=-1){
        if(r+1==k)
        l.add(root.val);
        findNode(root.left,k-r-2,l);
        return r+1;
    }
    return -1;
   }
 public void findNode(TreeNode root,int dis,ArrayList<Integer> l){
    if(root==null)
return;
if(dis==0){
    l.add(root.val);
    return;
}
 findNode(root.left,dis-1,l);
 findNode(root.right,dis-1,l);
   }

}