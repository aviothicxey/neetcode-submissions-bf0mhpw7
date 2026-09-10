class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zc = 0;
        for(int num : nums){
            if(num != 0){
                prod *= num;
            }else{
                zc++;
            }
        }
        int[]res = new int[nums.length];
        if(zc > 1){
            return res;
        }
        
        for(int i = 0 ; i < nums.length ;i++){
            if(zc == 1){
                if(nums[i]!= 0){
                    res[i] = 0;
                }else{
                    res[i] = prod;
                }
            }else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
