class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map <Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.isEmpty() && map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}