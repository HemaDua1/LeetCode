class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //number of columns
    int m=matrix[0].length;
    //number of rows
    int n=matrix.length;
   for(int i=0;i<n;i++){
  if(binarysearch(matrix[i],target))
return true;
   }
    return false;    
    }
    public static boolean binarysearch(int[] nums,int t){
        int s=0,e=nums.length-1,m=0;
        while(s<=e){
            m=s+(e-s)/2;
            if(nums[m]==t)
            return true;
            else if(nums[m]<t){
                s=m+1;
            }
            else
            e=m-1;
        }
        return false;
    }
}