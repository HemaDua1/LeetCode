class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      List<String> ans = new ArrayList<>();
        String combined = s1 + " " + s2;
        String[] words = combined.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                ans.add(word);
            }
        }
        
        return ans.toArray(new String[0]);
    }
}