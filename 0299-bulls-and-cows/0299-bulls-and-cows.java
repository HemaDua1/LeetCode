class Solution {
    public String getHint(String secret, String guess) {
    int b=0;
    int c=0;
    HashMap<Integer,Integer> h=new HashMap<>();
    HashMap<Integer,Integer> h1=new HashMap<>();  
    for(int i=0;i<secret.length();i++){
        int s=secret.charAt(i)-'0';
        int g=guess.charAt(i)-'0';
        if(s==g)
        b++;
        else{
            h.put(s,h.getOrDefault(s,0)+1);
            h1.put(g,h1.getOrDefault(g,0)+1);
        }
    }
    for(int k:h1.keySet()){
        if(h.containsKey(k))
        c+=Math.min(h.get(k),h1.get(k));
    }
    return b+"A"+c+"B";
    }
}