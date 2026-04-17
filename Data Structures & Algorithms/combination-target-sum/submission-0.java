class Solution {
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(0, new ArrayList<>() , target , nums);
        return ans;
    }
    public void backtrack(int start , List<Integer> ds , int target ,int[]arr){
        if(start == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        if(arr[start] <= target){
            ds.add(arr[start]);
            backtrack(start , ds , target - arr[start] , arr);
            ds.remove(ds.size()-1);
        }

        backtrack(start + 1 , ds , target , arr);
    }
}
