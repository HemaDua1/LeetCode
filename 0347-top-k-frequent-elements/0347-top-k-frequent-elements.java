class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int arr[]=new int[k];
    HashMap<Integer,Integer> h=new HashMap<>();
    Arrays.sort(nums);
    for(int i:nums)
h.put(i,h.getOrDefault(i,0)+1);
List<Integer> l=new ArrayList<>(h.keySet());
l.sort((a,b)->h.get(b)-h.get(a));
for(int i=0;i<k;i++)
arr[i]=l.get(i);
// System.out.println(l);
// System.out.println(h);
return arr;
    }
}