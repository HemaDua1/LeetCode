class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        // ArrayList<Integer> l=new ArrayList<>();
        // int ans=0;
        // for(int i:arr2)
        //    ans=ans^i;
        // for(int i:arr1)
        //    l.add(i&ans);
        // if(l.size()==1)
        //    return l.get(0);
        // else{
        //     int a=0;
        //     for(int i:l)
        //     a=a^i;
        //     return a;
        // }
        int a=0,b=0;
        for(int i:arr1)
          a=a^i;
        for(int i:arr2)
          b=b^i;
        return a&b;
    }
}