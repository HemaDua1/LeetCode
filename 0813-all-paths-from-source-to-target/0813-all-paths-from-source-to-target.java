class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
 List<List<Integer>> r=new ArrayList<>();
 Queue<List<Integer>> q=new LinkedList<>();
 List<Integer> initial=new ArrayList<>();
 initial.add(0);
 q.add(initial);
 while(!q.isEmpty()){
List<Integer> c=q.poll();
int last=c.get(c.size()-1);
if(last==graph.length-1)
r.add(new ArrayList<>(c));
for(int neighbor:graph[last]){
List<Integer> n=new ArrayList<>(c);
n.add(neighbor);
q.add(n);
}
 }
 return r;
    }
}