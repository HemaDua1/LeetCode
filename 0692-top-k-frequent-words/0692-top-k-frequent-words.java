class Solution {
    public List<String> topKFrequent(String[] words, int k) {
   List<String> ans=new ArrayList<>();
   HashMap<String,Integer> h=new HashMap<>();
for(String w:words)
h.put(w,h.getOrDefault(w,0)+1);

PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (h.get(a).equals(h.get(b))) 
                return a.compareTo(b);
            return h.get(b) - h.get(a); 
            });
             pq.addAll(h.keySet());
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}