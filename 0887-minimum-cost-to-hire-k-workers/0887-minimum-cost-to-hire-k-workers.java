class Solution {
    class Pair{
        double ratio;
        int q;
        Pair(double ratio, int q){
            this.ratio = ratio;
            this.q = q;
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        List<Pair> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new Pair((double) wage[i] / quality[i], quality[i]));
        }
        Collections.sort(l, (a, b) -> Double.compare(a.ratio, b.ratio));
        PriorityQueue<Integer> h = new PriorityQueue<>((a,b)->b-a);
        int qs = 0;
        double ans = Double.POSITIVE_INFINITY; 
        for (int i = 0; i < n; i++) {
            h.add(l.get(i).q);
            qs += l.get(i).q;
            if (h.size() > k) {
                qs -= h.poll();
            }
            if (h.size() == k) {
                double c = l.get(i).ratio * qs;
                ans = Math.min(ans, c);
            }
        }
        return ans;
    }
}
