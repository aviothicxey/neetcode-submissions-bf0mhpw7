class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxlen =0;
        for(char r : s.toCharArray()){
            while(set.contains(r)){
                set.remove(s.charAt(l));
                l = l +1;
            }
            
                set.add(r);
                
            
            int len = set.size();
            maxlen = Math.max(maxlen,len );
        }
        return maxlen;
        
    }
}
