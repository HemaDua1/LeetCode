class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BiparttitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        int n=graph.length;
        for(int vtx=0;vtx<n;vtx++){
            //BFS
            if(visited.containsKey(vtx)){
                continue;
            }
            q.add(new BiparttitePair(vtx, 0));
            while(!q.isEmpty()){
                //1. Remove
                BiparttitePair rp = q.poll();
                //2. Ignore if already visited
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx)!=rp.dis)//odd length ka cycle
                    return false;
                    continue;
                }
                //3. Mark visited
                visited.put(rp.vtx, rp.dis);
                for(int nbrs:graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BiparttitePair(nbrs, rp.dis+1));
                    }
                }
                //5. Add unvisited nbrs
            }
        }
        return true;
    }
    class BiparttitePair{
        int vtx;
        int dis;
        BiparttitePair(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}