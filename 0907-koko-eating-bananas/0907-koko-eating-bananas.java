class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int l=1;
      int r=1000000000;
      while(l<r){
        int m=l+(r-l)/2;
        if(check(piles,m,h))
        r=m;
        else
        l=m+1;
      }
      return l;
    }
    public boolean check(int[] piles,int k,int h){
        int t=0;
        for(int i=0;i<piles.length;i++){
            int d=piles[i]/k;
            t+=d;
            if(piles[i]%k!=0)
            t++;
        }
        return t<=h;
    }
}