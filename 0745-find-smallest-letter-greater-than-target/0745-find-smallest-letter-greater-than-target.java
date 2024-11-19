class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     return binarysearch(letters,target);   
    }
    public static char binarysearch(char[] nums,char t ){
        int s=0,e=nums.length-1;
        char ans=nums[0];
        while(s<=e){
           int m=s+(e-s)/2;
            if(nums[m]>t){
                ans=nums[m];
                e=m-1;
            }
              else
                s=m+1;
        }
        return ans;
    }
}