class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long s) {
int n=spells.length;
int m=potions.length;
int ans[]=new int[n];
   Arrays.sort(potions);
for(int i=0;i<n;i++){
    int l=0,r=m-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        long p=(long) spells[i]*potions[mid];
        if(p>=s){
        r=mid-1;
        }
        else
        l=mid+1;
    }
  ans[i]=m-l;  
}
return ans;
    }
}