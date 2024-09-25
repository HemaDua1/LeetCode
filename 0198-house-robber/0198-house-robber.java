class Solution {
    public int rob(int[] n) {
    if(n.length==0)
    return 0;
    if(n.length==1)
    return n[0];
if(n.length==2)
return Math.max(n[0],n[1]);
int p1=0,p2=0;
for(int i=0;i<n.length;i++){
int t=p1;
p1=Math.max(p1,p2+n[i]);
p2=t;
}
return p1;
    }
}