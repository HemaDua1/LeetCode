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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
     return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);  
    }
    public TreeNode create(int[] preorder,int ps,int pe,int[] inorder,int is,int ie, HashMap<Integer,Integer> map){
    if(ps>pe||is>ie){
        return null;
    }
TreeNode root=new TreeNode(preorder[ps]);
int rootidx=map.get(root.val);
int leftidx=rootidx-is;
root.left=create(preorder,ps+1,ps+leftidx,inorder,is,rootidx-1,map); 
root.right=create(preorder,ps+leftidx+1,pe,inorder,rootidx+1,ie,map); 
return root;

    }
}