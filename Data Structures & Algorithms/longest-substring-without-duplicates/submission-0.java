class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); 
        if(n==0) return 0; 
        int freq[]= new int[256];
        int maxx = 0; 
        int l = 0; 
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i); 
            freq[ch]++;
            while(freq[ch] > 1){
                freq[s.charAt(l)]--;
                l++;
            } 
            maxx = Math.max(maxx,i-l+1); 
        } 
        return maxx;
    }
}
