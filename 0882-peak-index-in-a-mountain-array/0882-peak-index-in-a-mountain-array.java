class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    //  int max=Integer.MIN_VALUE;
    //  int j=-1;
    //  for(int i=0;i<arr.length;i++){
    //     if(max<arr[i]){
    //         max=arr[i];
    //         j=i;
    //     }
    //  }  
    //  return j;
    int n=arr.length;
    int s=0,e=n-1;
    while(s<e){
int m=s+(e-s)/2;
if(arr[m]<arr[m+1])
s=m+1;
else
e=m;
    }
    return s;
    }
}