class Solution {
    public long countPairs(int n, int[][] edges) {
      List<List<Integer>> graph=new ArrayList<>();
      for(int i=0;i<n;i++)
      graph.add(new ArrayList<>());
      for(int[] edge:edges){
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
      }
      boolean v[]=new boolean[n];
      List<Integer> c=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(!v[i])
        c.add(bfs(i,graph,v));
      }
      long t=n;
      long u=0;
      for(int i:c)
      u+=(long)i*(t-i);
      return u/2;
    }
public int bfs(int i,List<List<Integer>> graph,boolean[] v){
Queue<Integer> q=new LinkedList<>();
q.add(i);
v[i]=true;
int size=0;
while(!q.isEmpty()){
    int c=q.poll();
    size++;
    for(int neighbor:graph.get(c)){
if(!v[neighbor]){
v[neighbor]=true;
q.add(neighbor);
}
    }
}
return size;
    }
}
