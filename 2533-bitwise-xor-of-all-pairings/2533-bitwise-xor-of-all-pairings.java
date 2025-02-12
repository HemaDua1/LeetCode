class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1%2==0 && n2%2==0)
        return 0;
        int xor1=bit_xor(nums1);
        int xor2=bit_xor(nums2);
        if(n1%2!=0 && n2%2!=0)
        return xor1^xor2;
        else if(n1%2==0)
        return xor1;
        else;
        return xor2;
    }
    public int bit_xor(int[] arr){
        int ans=0;
        for(int i:arr)
        ans=ans^=i;
        return ans;
    }
}