class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(0 , nums);
        return ans;
    }
    public void backtrack(int ind , int[] nums){
        if(ind == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i =0 ; i < nums.length ; i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i = ind ; i < nums.length ; i++){
            swap(i , ind , nums);
            backtrack(ind + 1, nums);
            swap(i , ind , nums);
        }
    }
    public void swap(int i , int j, int[] arr){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}
