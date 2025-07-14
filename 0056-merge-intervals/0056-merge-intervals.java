class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] inter=intervals[i];
            if(inter[0]<=prev[1])
            prev[1]=Math.max(prev[1],inter[1]);
            else{
                merged.add(prev);
                prev=inter;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}