class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
       int r=mat.length,c=mat[0].length;
       Map<Integer,int[]> h=new HashMap<>();
       int[] rc=new int[r];
       int[] cc=new int[c];
       Arrays.fill(rc,c);
        Arrays.fill(cc,r);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            h.put(mat[i][j],new int[]{i,j});
        }
        for(int i=0;i<arr.length;i++){
            int[] p=h.get(arr[i]);
            if(--rc[p[0]]==0 || --cc[p[1]]==0)
            return i;
        }
        return -1;
    }
}