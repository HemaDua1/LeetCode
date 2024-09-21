class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
     for(int i=n,j=0;i<n+m;i++,j++)
     arr1[i]=arr2[j];
     Arrays.sort(arr1);  
    }
}