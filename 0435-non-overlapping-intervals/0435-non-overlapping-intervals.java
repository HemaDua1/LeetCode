class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in,(a,b)->a[1]-b[1]);
        int c=0;
        int prev=in[0][1];
        for(int i=1;i<in.length;i++){
            if(in[i][0]<prev)
            c++;
            else
            prev=in[i][1];
        }
        return c;
    }
}