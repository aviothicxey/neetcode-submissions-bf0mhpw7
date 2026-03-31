class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = 0 ;
        int e = nums.length -1;
        while(s<e){
            int res = nums[s] + nums[e];
            if(res == target){
                return new int[]{s+1 , e+1};
            }
            if(res < target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
}
