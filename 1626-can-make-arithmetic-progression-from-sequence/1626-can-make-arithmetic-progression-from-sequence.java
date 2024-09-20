class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    int d=arr[1]-arr[0];
   for(int i=1;i<arr.length-1;i++){
    int d1=arr[i+1]-arr[i];
    if(d!=d1)
    return false;
   }  
   return true; 
    }
}