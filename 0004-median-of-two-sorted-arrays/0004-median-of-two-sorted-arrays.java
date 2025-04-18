class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     if(nums1.length<=nums2.length)
     return median(nums1,nums2);
     else
     return median(nums2,nums1);
    }
    public static double median(int[] nums1,int[] nums2){
        int lo=0;
     int hi=nums1.length;
     int n=nums1.length,m=nums2.length;
     while(lo<=hi){
        int cut1=(lo+hi)/2;
        int cut2=((n+m+1)/2)-cut1;
        int l1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
        int r1=cut1==n?Integer.MAX_VALUE:nums1[cut1];
        int l2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
        int r2=cut2==m?Integer.MAX_VALUE:nums2[cut2];
        if(l1<=r2 && l2<=r1){
            if((n+m)%2==0)
            return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            else
            return Math.max(l1,l2);
        }
        else if(l1>=r2){
            hi=cut1-1;
        }
        else{
            lo=cut1+1;
        }

     }
     return 0.0;
    }
}