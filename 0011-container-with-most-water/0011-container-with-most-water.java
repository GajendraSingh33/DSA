class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int lp=0;
        int rp= height.length-1;

        while(lp < rp){
            int width = rp - lp;
            int currentHeight = Math.min(height[lp], height[rp]);
            int currentArea = width * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxArea;
        
    }
}
