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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> l=new ArrayList<List<Integer>>();
       List<Integer> l1=new ArrayList<>();
    check(root,targetSum,l,l1);
    return l;
    }
    public void check(TreeNode root,int t,List<List<Integer>> l,List<Integer> l1){
        if(root==null){
         return;
        }
        if(root.left==null&&root.right==null){
              if(root.val==t){
            l1.add(root.val);
           l.add(new ArrayList<>(l1));
           l1.remove(l1.size()-1);
        }
         }
     l1.add(root.val);
     check(root.left,t-root.val,l,l1);
     check(root.right,t-root.val,l,l1);
     l1.remove(l1.size()-1);
    }
}