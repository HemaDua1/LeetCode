import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 int n=nums1.length;
 int m=nums2.length;
 int mer[]=new int[n+m];
 int k=0;
 for(int i=0;i<n;i++)
 mer[k++]=nums1[i];
  for(int i=0;i<m;i++)
 mer[k++]=nums2[i];
 Arrays.sort(mer);
 int t=mer.length;
if(t%2!=0)
return (double)mer[t/2];
else{
    int i=mer[t/2-1];
    int j=mer[t/2];
    return (double)(i+j)/2.00;
}
    }
}