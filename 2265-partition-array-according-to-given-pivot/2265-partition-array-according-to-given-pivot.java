class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> s=new ArrayList<>();
       ArrayList<Integer> e=new ArrayList<>();
       ArrayList<Integer> l=new ArrayList<>();
    for(int i:nums){
        if(i>pivot)
        l.add(i);
        else if(i<pivot)
        s.add(i);
        else
        e.add(i);
    }
    int j=0;
    int res[]=new int[nums.length];
    for(int i:s){
        res[j]=i;
        j++;
    }
    for(int i:e){
        res[j]=i;
        j++;
    }
    for(int i:l){
        res[j]=i;
        j++;
    }
       return res;
    }
}