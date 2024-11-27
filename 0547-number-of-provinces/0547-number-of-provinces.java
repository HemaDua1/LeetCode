class Solution {
    public int findCircleNum(int[][] adj) {
 ArrayList<ArrayList<Integer>> ad=new ArrayList<ArrayList<Integer>>();
 int V=adj.length;
 for(int i=0;i<V;i++)
 ad.add(new ArrayList<Integer>());
 
 for(int i=0;i<V;i++){
     for(int j=0;j<V;j++){
         if(adj[i][j]==1&&i!=j){
             ad.get(i).add(j);
             ad.get(j).add(i);
         }
     }
 } 
 int vis[]=new int[V];
 int cnt=0;
 for(int i=0;i<V;i++){
     if(vis[i]==0){
         cnt++;
         dfs(i,ad,vis);
     }
 }
 return cnt;
    }
    public static void dfs(int i,ArrayList<ArrayList<Integer>> adj,int[] vis){
        vis[i]=1;
        for(Integer it:adj.get(i)){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }
}