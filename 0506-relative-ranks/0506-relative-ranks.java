class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);   
        int n = score.length;
        for (int i = 0; i < n; i++) {
            pq.add(i);
        }
        String[] res = new String[n];
        int rank = 1;
        while (!pq.isEmpty()) {
            int idx = pq.poll();
            if (rank == 1) {
                res[idx] = "Gold Medal";
            } else if (rank == 2) {
                res[idx] = "Silver Medal";
            } else if (rank == 3) {
                res[idx] = "Bronze Medal";
            } else {
                res[idx] = String.valueOf(rank);
            }
            rank++;
        }
        
        return res;
    }
}