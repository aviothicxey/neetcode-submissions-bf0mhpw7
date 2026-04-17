class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0 , nums.length ,nums, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start , int end , int[]arr , List<Integer>curr){
        if(start >= end){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(arr[start]);
        backtrack(start + 1 , end , arr , curr);
        curr.remove(curr.size() -1);
        backtrack(start + 1 , end , arr , curr);
    }
}
