class Solution {
    public boolean isBipartite(int[][] graph) {
      int arr[]=new int[graph.length];
  Arrays.fill(arr,-1);
  for(int i=0;i<graph.length;i++){
    Queue<Integer> q=new LinkedList<>();
    q.add(i);
    arr[0]=0;
    while(!q.isEmpty()){
        int curr=q.poll();
        for(int nbr:graph[curr]){
            if(arr[nbr]==-1){
                arr[nbr]=1-arr[curr];
                q.add(nbr);
            }
            else if(arr[nbr]==arr[curr])
            return false;
        }
    }
  }
  return true;
    }
}