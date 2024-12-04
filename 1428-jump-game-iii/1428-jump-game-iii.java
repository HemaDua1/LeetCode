class Solution {
    public boolean canReach(int[] arr, int start) {
     int n=arr.length;
  Queue<Integer> q=new LinkedList<>();
  boolean vis[]=new boolean[n];
  q.add(start);
  vis[start]=true;
  while(!q.isEmpty()){
    int c=q.poll();
    if(arr[c]==0)
   return true;
    int nl=c-arr[c];
    int nr=c+arr[c];
    if(nl>=0&&!vis[nl]){
        vis[nl]=true;
        q.add(nl);
    }
     if(nr<n&&!vis[nr]){
        vis[nr]=true;
        q.add(nr);
    }
  }
return false;
    }
}