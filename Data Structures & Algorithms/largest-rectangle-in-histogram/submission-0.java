class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i <= n ; i++){
            int curr;
            if(i == n) curr = 0;
            else curr = heights[i];
            while(!st.isEmpty() && heights[st.peek()] > curr){
                int height = heights[st.pop()];
                int width ;
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i - st.peek() -1;
                }
                int area = height * width;
                maxArea = Math.max(area , maxArea);
            }

            st.push(i);
        }
        return maxArea;
    }
}
