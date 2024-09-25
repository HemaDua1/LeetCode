class Solution {
    public void rotate(int[][] matrix) {
    int r=matrix.length;
    for(int i=0;i<r;i++){
        for(int j=0;j<=i;j++){
            int t=matrix[i][j];
            matrix[i][j]=matrix[j][i];
matrix[j][i]=t;
    }  
    }
    for(int i=0;i<r;i++)
reverserow(matrix[i]);
    }
    public void reverserow(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}