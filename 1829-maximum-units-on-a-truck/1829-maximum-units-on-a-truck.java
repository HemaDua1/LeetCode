class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        System.out.println(Arrays.deepToString(boxTypes));
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>0){
                if(truckSize-boxTypes[i][0]>=0){
               ans=ans+(boxTypes[i][0]*boxTypes[i][1]);
                }
                else{
                    ans=ans+((truckSize)*boxTypes[i][1]); 
                }
                truckSize=truckSize-boxTypes[i][0];
             System.out.println(truckSize);
            }
        }
        return ans;
    }
}