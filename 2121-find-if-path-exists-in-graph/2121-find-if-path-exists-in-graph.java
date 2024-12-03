class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
       List<List<Integer>> graph=new ArrayList<>();
       for(int i=0;i<n;i++)
       graph.add(new ArrayList<>());
       for(int[] edge:edges){
        graph.get(edge[1]).add(edge[0]);
        graph.get(edge[0]).add(edge[1]);
       } 
       boolean v[]=new boolean[n];
      return bfs(graph,v,s,d);
    }
    public boolean bfs(List<List<Integer>> graph,boolean[] v,int s,int d){
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        v[s]=true;
        while(!q.isEmpty()){
            int c=q.poll();
            if(c==d)
            return true;
            for(int nei:graph.get(c)){
            if(!v[nei]){
                v[nei]=true;
                q.add(nei);
            }
        }
        }
        return false;
    }
}