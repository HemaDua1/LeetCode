class Solution {
    public boolean matchReplacement(String s1, String sub, char[][] mappings) {
        Map<Character, Set<Character>> replacementMap = new HashMap<>();
        for (char[] mapping : mappings) {
            char oldChar = mapping[0];
            char newChar = mapping[1];
            replacementMap.putIfAbsent(oldChar, new HashSet<>());
            replacementMap.get(oldChar).add(newChar);
        }
 for (char ch : sub.toCharArray()) {
            replacementMap.putIfAbsent(ch, new HashSet<>());
            replacementMap.get(ch).add(ch);
        }
         int n = s1.length(), m = sub.length();
           for (int i = 0; i <= n - m; i++) {
            String window = s1.substring(i, i + m);
            if (isValidMatch(window, sub, replacementMap)) {
                return true; 
            }
        }

        return false;  
    }

    private boolean isValidMatch(String window, String sub, Map<Character, Set<Character>> replacementMap) {
        for (int i = 0; i < sub.length(); i++) {
            char subChar = sub.charAt(i);
            char windowChar = window.charAt(i);
            if (!replacementMap.get(subChar).contains(windowChar)) {
                return false;
            }
        }
        return true;
    }
}