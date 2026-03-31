class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int n = heights.length;
        for(int i = 0 ; i < n ; i++ ){
            for(int j = i+1 ; j < n ;j++){
                int w = Math.min(heights[i],heights[j]);
                int l = j - i;
                int a = l * w;

                maxarea = Math.max(a,maxarea);
            }
        }
        return maxarea;
    }
}
