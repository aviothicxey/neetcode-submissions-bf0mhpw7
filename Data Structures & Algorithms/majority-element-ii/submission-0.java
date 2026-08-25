class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cand1 = 0;
        int vote1 = 0;

        int cand2 = 0 ;
        int vote2 = 0 ;

        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] == cand1){
                vote1++;
            }
            else if(nums[i] == cand2){
                vote2++;
            }else if(vote1 == 0){
                cand1 = nums[i];
                vote1++;
            }
            else if (vote2 == 0){
                cand2 = nums[i];
                vote2++;
            }else{
                vote1--;
                vote2--;
            }
        }
        vote1 = 0;
        vote2 = 0;

        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] == cand1) vote1++;
            if(nums[i] == cand2) vote2++;
        }
        if(vote1 > nums.length/3) ans.add(cand1);
        if(vote2 > nums.length/3) ans.add(cand2);
        return ans;
    }
}