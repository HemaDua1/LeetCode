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
    public TreeNode sortedArrayToBST(int[] nums) {
    int start=0;
    int e=nums.length-1;
    return create(nums,start,e);    
    }
    TreeNode create(int[] num,int s,int e){
        if(s>e){
            return null;
        }
        int m=(e-s)/2+s;
        TreeNode root=new TreeNode(num[m]);
        root.left=create(num,s,m-1);
        root.right=create(num,m+1,e);
        return root;
    }
}