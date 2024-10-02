class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();
        Arrays.sort(temp);
  HashMap<Integer, Integer> h = new HashMap<>();
        int rank = 1;
        for (int num : temp) {
            if (!h.containsKey(num)) {
               h.put(num, rank++);
            }
        }
      for (int i = 0; i < arr.length; i++) {
            arr[i] = h.get(arr[i]);
        }
        
        return arr;
    }
}