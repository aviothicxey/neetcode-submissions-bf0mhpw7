class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();

        for(String i : strs){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)){
                map.get(key).add(i);
            }
           else{
            map.put(key , new ArrayList<>());
            map.get(key).add(i);
           }
        }
        ans.addAll(map.values());
        return ans;
    }
}
