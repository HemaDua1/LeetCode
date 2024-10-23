class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int s=1;
        int e=(int)1e7;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            double speed=m;
            if(isPossible(speed,dist,hour)){
                ans=m;
                e=m-1;
            }
            else
            s=m+1;
        }
        return ans;
    }
    public boolean isPossible(double s,int[] dist,double h){
       double t=0;
   for(int i=0;i<dist.length-1;i++){
  double h1=dist[i]/s;
  t+=Math.ceil(h1);
  if(t>h)
  return false;
   }
   t+=dist[dist.length-1]/s;
   return t<=h?true:false;
    }
}