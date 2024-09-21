class Solution {
    public int lengthOfLIS(int[] nums) {
     ArrayList<Integer> res=new ArrayList<>();
     for(int n:nums){
        if(res.isEmpty() || res.get(res.size()-1)<n)
        res.add(n);
        else{
            int i=binarysearch(res,n);
            res.set(i,n);
        }
     }  
     return res.size(); 
    }
    private int binarysearch(ArrayList<Integer> arr,int t){
        int l=0;
        int r=arr.size()-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr.get(m)==t)
            return m;
            else if(arr.get(m)>t)
            r=m-1;
            else
            l=m+1;
        }
        return l;
    }
}