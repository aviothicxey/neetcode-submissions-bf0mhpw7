class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lm = new int[n];
        int[] rm = new int[n];
        int rightmax = Integer.MIN_VALUE;
        int leftmax = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++ ){
            if(height[i] > leftmax){
                leftmax = height[i];
            }
            lm[i] = leftmax;
        }
        for(int i = n -1 ; i >=0 ;i--){
           if(height[i] > rightmax){
               rightmax = height[i];
            }
            rm[i] = rightmax;
        }
        int[] water = new int[n];
        for(int i = 0 ; i < n ; i++){
            water[i] = Math.min(lm[i] , rm[i]) - height[i];
        }
        int sum = 0;
        for(int i = 0 ; i < water.length ; i++){
           if(water[i] > 0){
                sum += water[i];
            }
        }
        return sum;

    }
}
