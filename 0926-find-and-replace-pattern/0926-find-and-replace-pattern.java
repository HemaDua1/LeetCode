class Solution {
    public List<String> findAndReplacePattern(String[] words, String p) {
    List<String> ans=new ArrayList<>();
 for(String w:words){
    if(match(w,p))
    ans.add(w);
 }
 return ans;
    }
    public boolean match(String w,String p){
      HashMap<Character, Character> wordToPattern = new HashMap<>();
        HashMap<Character, Character> patternToWord = new HashMap<>();
        for (int i = 0; i < w.length(); i++) {
            char wch = w.charAt(i);
            char pch = p.charAt(i);
    if (wordToPattern.containsKey(wch) && wordToPattern.get(wch) != pch)
                return false;
      if (patternToWord.containsKey(pch) && patternToWord.get(pch) != wch) 
                return false;
         wordToPattern.put(wch, pch);
            patternToWord.put(pch, wch);
        } 
        return true; 
    }
}