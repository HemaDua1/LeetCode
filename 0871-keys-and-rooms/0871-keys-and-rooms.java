class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
boolean[] v=new boolean[rooms.size()];
Queue<Integer> q=new LinkedList<>();
q.add(0);
v[0]=true;
while(!q.isEmpty()){
    int r=q.poll();
    for(int k:rooms.get(r)){
        if(!v[k]){
            v[k]=true;
            q.add(k);
        }
    }
}
for(boolean k:v){
    if(!k)
    return false;
}
return true;
    }
}