class Solution {
    public int mySqrt(int x) {
        if(x==0)
        return 0;
    int s=1,e=x,m=0;
    while(s<=e){
            m=s+(e-s)/2;
            if(m==x/m)
            return m;
            else if(m<x/m)
                s=m+1;
            else
            e=m-1;
        }
        return e;  
    }
}