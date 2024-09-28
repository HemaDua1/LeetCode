class Solution {
    public int[] singleNumber(int[] nums) {
    int arr[]=new int[2];
    HashMap<Integer,Integer> h= new HashMap<>();
    for(int i:nums)
    h.put(i,h.getOrDefault(i,0)+1);
    int j=0;
    for(int i:h.keySet()){
        if(h.get(i)==1){
            arr[j]=i;
            j++;
        }

    } 
    return arr;   
    }
}