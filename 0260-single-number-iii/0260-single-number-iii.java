class Solution {
    public int[] singleNumber(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        int  mask=(ans & (~(ans-1)));
        //mask=ans & -ans;
        int a=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&mask)!=0)
            a^=arr[i];
        }
        int b=ans^a;
        return new int[]{a,b};
    }
}