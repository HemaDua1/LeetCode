class Solution {
    public int numberOfSpecialChars(String word) {
   HashMap<Character,Integer> h=new HashMap<>();
    HashMap<Character,Integer> h1=new HashMap<>();  
    for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(Character.isLowerCase(ch))
        h.put(ch,i);
        else if(Character.isUpperCase(ch)){
            char c=Character.toLowerCase(ch);
            if(!h1.containsKey(c))
            h1.put(c,i);
        }
    } 
    int c=0;
    for(char ch:h.keySet()){
        if(h1.containsKey(ch)){
            if(h.get(ch)<h1.get(ch))
            c++;
        }
    }  
    return c;
    }
}