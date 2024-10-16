class Solution {
    public int maxArea(int[] height) {
    int s=0,e=height.length-1;
    int ans=0;
while(s<e){
   int minh=Math.min(height[s],height[e]);
   ans=Math.max(ans,minh*(e-s));
   if(height[s]<height[e])
   s++;
   else
   e--;
}
return ans;
    }
}