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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> l=new ArrayList<>();
    if(root==null){
        return l;
    }    
    Queue<TreeNode> q=new LinkedList<>();
    Stack<TreeNode> st=new Stack<>();
    boolean ltr=true;
    q.add(root);
    while(!q.isEmpty()){
        int s=q.size();
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<s;i++){
        TreeNode n=q.poll();
        if(ltr)
        l1.add(n.val);
        else
        st.push(n);
        if(n.left!=null)
        q.add(n.left);
         if(n.right!=null)
        q.add(n.right);
        }
        if(!ltr){
            while(!st.isEmpty())
            l1.add(st.pop().val);
        }
        ltr=!ltr;
        l.add(l1);
    }
    return l;
    }
}