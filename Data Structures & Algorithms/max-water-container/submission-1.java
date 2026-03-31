class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int rp = heights.length -1;
        int lp = 0;
        while(lp < rp){
                int w = Math.min(heights[lp],heights[rp]);
                int l = rp - lp;
                int a = l * w;

                maxarea = Math.max(a,maxarea);

                if(heights[lp] < heights[rp]){
                    lp++;
                }
                else{
                    rp--;
                }
            }
        return maxarea;
    }
}
