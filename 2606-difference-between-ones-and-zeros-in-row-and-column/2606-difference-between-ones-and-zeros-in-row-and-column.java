class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
    int diff[][]=new int[r][c];
    int[] onesRowCount = new int[r];
        int[] zeroesRowCount = new int[r];
        int[] onesColCount = new int[c];
        int[] zeroesColCount = new int[c];
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    onesRowCount[i]++;
                    onesColCount[j]++;
                } else {
                    zeroesRowCount[i]++;
                    zeroesColCount[j]++;
                }
            }
        }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            diff[i][j]=onesRowCount[i] + onesColCount[j] - zeroesRowCount[i] - zeroesColCount[j];
        }
    }   
    return diff; 
    }
}
