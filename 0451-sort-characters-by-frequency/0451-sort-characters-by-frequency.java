class Solution {
    public String frequencySort(String s) {
     HashMap<Character,Integer> h=new HashMap<>();
     for(char c:s.toCharArray()){
        h.put(c,h.getOrDefault(c,0)+1);
     } 
      PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(h.entrySet());
     StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();     
    }
}