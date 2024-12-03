/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
   if(node==null)
   return null;
   return clone(node,new HashMap<>()); 
    }
    public Node clone(Node node,HashMap<Node,Node> v){
        if(v.containsKey(node))
        return v.get(node);
        Node n=new Node(node.val);
        v.put(node,n);
        for(Node nei:node.neighbors)
        n.neighbors.add(clone(nei,v));
        return n;
    }
}