class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int s=0,e=n-1;
       while(e>s){
        int a=nums[s];
        int b=nums[e];
        if(a%2!=0&&b%2==0){
            swap(s,e,nums);
            s++;
            e--;
        }
        else if(b%2!=0)
        e--;
        else
        s++;
       } 
       return nums;
    }
       public void swap(int a,int b,int[] arr){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
       }
}