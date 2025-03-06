class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     int[] ans=new int[2];
     int n=grid.length;
     int size=n*n;
     int c[]=new int[size+1];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        c[grid[i][j]]++;
     } 
     for(int i=1;i<=size;i++){
        if(c[i]==2)
        ans[0]=i;
        if(c[i]==0)
        ans[1]=i;
     }
     return ans;
    }
}